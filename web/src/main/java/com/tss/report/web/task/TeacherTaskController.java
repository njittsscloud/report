package com.tss.report.web.task;

import com.tss.basic.site.argumentresolver.JsonParam;
import com.tss.report.interfaces.task.TaskInterface;
import com.tss.report.interfaces.task.vo.TaskCreateReqVO;
import com.tss.report.interfaces.task.vo.TaskDetailReqVO;
import com.tss.report.interfaces.task.vo.TaskDetailRespVO;
import com.tss.report.interfaces.task.vo.TaskUpdateReqVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "教师实验任务模块", tags = "TeacherTaskController", description = "教师实验任务模块")
@RestController
@RequestMapping("/task/teacher")
public class TeacherTaskController {
    private static final Logger LOG = LoggerFactory.getLogger(TeacherTaskController.class);

    @Autowired
    private TaskInterface taskInterface;

    @ApiOperation(value = "实验任务详情", notes = "实验任务详情")
    @RequestMapping(value = "/getTaskDetail", method = RequestMethod.POST)
    public TaskDetailRespVO getTaskDetail(@JsonParam(validation = true) TaskDetailReqVO param) {
        return taskInterface.getTaskDetail(param);
    }

    @ApiOperation(value = "创建实验任务", notes = "创建实验任务")
    @RequestMapping(value = "/createTask", method = RequestMethod.POST)
    public Long createTask(@JsonParam(validation = true) TaskCreateReqVO param) {
        return taskInterface.createTask(param);
    }

    @ApiOperation(value = "更新实验任务", notes = "更新实验任务")
    @RequestMapping(value = "/updateTask", method = RequestMethod.POST)
    public void updateTask(@JsonParam(validation = true) TaskUpdateReqVO param) {
        taskInterface.updateTask(param);
    }

    @ApiOperation(value = "实验任务列表", notes = "实验任务详情")
    @RequestMapping(value = "/getTaskList", method = RequestMethod.POST)
    public TaskDetailRespVO getTaskList(@JsonParam(validation = true) TaskDetailReqVO param) {
        // TODO
        return taskInterface.getTaskDetail(param);
    }

}
