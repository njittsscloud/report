package com.tss.report.services.task;

import com.tss.report.interfaces.task.TaskInterface;
import com.tss.report.interfaces.task.vo.TaskDetailReqVO;
import com.tss.report.interfaces.task.vo.TaskDetailRespVO;
import com.tss.report.interfaces.task.vo.TeacherCourseCurriculumProjectRespVO;
import com.tss.report.services.task.feign.DataFeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService implements TaskInterface {
    public static final Logger LOG = LoggerFactory.getLogger(TaskService.class);

    @Autowired
    private DataFeignService dataFeignService;

    @Override
    public TaskDetailRespVO getTaskDetail(TaskDetailReqVO param) {
        TaskDetailRespVO detail = new TaskDetailRespVO();

        // 获取教师课程分配和课表信息
        TeacherCourseCurriculumProjectRespVO teacherCourseProjectInfo
                = dataFeignService.getTeacherCourseCurriculumProjectList(param.getTeacherId());
        if (teacherCourseProjectInfo != null) {
            detail.setCourseProjectList(teacherCourseProjectInfo.getCourseProjectList());
        }
        return detail;
    }
}
