package com.tss.report.services.task;

import com.tss.basic.common.util.JsonUtil;
import com.tss.basic.common.util.ModelMapperUtil;
import com.tss.basic.site.exception.DataCheckException;
import com.tss.basic.site.util.TSSAssert;
import com.tss.report.interfaces.task.TaskInterface;
import com.tss.report.interfaces.task.vo.*;
import com.tss.report.services.task.dao.TaskClassDao;
import com.tss.report.services.task.dao.TaskDao;
import com.tss.report.services.task.feign.DataFeignService;
import com.tss.report.services.task.po.Task;
import com.tss.report.services.task.po.TaskClass;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TaskService implements TaskInterface {
    public static final Logger LOG = LoggerFactory.getLogger(TaskService.class);

    @Autowired
    private TaskDao taskDao;
    @Autowired
    private TaskClassDao taskClassDao;
    @Autowired
    private DataFeignService dataFeignService;

    @Override
    public TaskDetailRespVO getTaskDetail(TaskDetailReqVO param) {
        // 实验任务信息
        Task task = taskDao.findById(param.getTaskId());
        if (task == null) {
            throw new DataCheckException("无效的实验任务id");
        }
        TaskDetailRespVO detail = ModelMapperUtil.strictMap(task, TaskDetailRespVO.class);
        detail.setTaskId(task.getId());
        detail.setTaskName(task.getName());

        // 实验班级
        List<TaskClass> taskClassList = taskClassDao.findByTaskId(param.getTaskId());
        if (CollectionUtils.isNotEmpty(taskClassList)) {
            Map<Long, TaskClass> classMap = taskClassList.stream().collect(Collectors.toMap(TaskClass::getClassId, e -> e));
            detail.setClassIds(new ArrayList<>(classMap.keySet()));
        }

        // 获取教师课程分配和课表信息
        TeacherCourseCurriculumProjectRespVO teacherCourseProjectInfo
                = dataFeignService.getTeacherCourseCurriculumProjectList(param.getTeacherId());
        if (teacherCourseProjectInfo != null) {
            detail.setCourseProjectList(teacherCourseProjectInfo.getCourseProjectList());
        }
        return detail;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Long createTask(TaskCreateReqVO param) {
        // 实验任务
        Task task = this.buildTask(param);
        int count = taskDao.insert(task);
        TSSAssert.isTrue((count > 0 && task.getId() != null), "保存实验任务失败", 
                () -> LOG.error("save task error, param={}", JsonUtil.obj2json(param)));
        // 实验班级
        this.saveTaskClass(task.getId(), task.getName(), param.getClassList());
        return task.getId();
    }

    private Task buildTask(TaskCreateReqVO param) {
        Task task = ModelMapperUtil.strictMap(param, Task.class);
        task.setCreateTime(new Date());
        task.setUpdateTime(new Date());
        return task;
    }

    private void saveTaskClass(Long taskId, String taskName, List<ClassBaseInfoVO> classList) {
        classList.stream().forEach(e -> {
            TaskClass taskClass = new TaskClass();
            taskClass.setTaskId(taskId);
            taskClass.setTaskName(taskName);
            taskClass.setClassId(e.getClassId());
            taskClass.setClassName(e.getClassName());
            taskClass.setCreateTime(new Date());
            taskClass.setUpdateTime(new Date());
            int effect = taskClassDao.insert(taskClass);
            if (effect == 0) {
                LOG.error("save task class error, taskId={}, taskName={}, classList={}", taskId, taskName, JsonUtil.obj2json(classList));
                throw new DataCheckException("保存实验任务班级失败");
            }
        });
    }

    @Override
    public void updateTask(TaskUpdateReqVO param) {
        Task task = taskDao.findById(param.getId());
        TSSAssert.isNotNull(task, "实验任务id无效");
        
        Task newTask = ModelMapperUtil.strictMap(param, Task.class);
        newTask.setUpdateTime(new Date());
        int count = taskDao.update(newTask);
        TSSAssert.isTrue(count > 0, "更新实验任务失败",
                () -> LOG.error("update task error, param={}", JsonUtil.obj2json(param)));

        // 实验班级
        taskClassDao.deleteByTaskId(param.getId());
        this.saveTaskClass(param.getId(), newTask.getName(), param.getClassList());
    }
    
    
}
