package com.tss.report.web.task;

import com.github.pagehelper.PageInfo;
import com.tss.basic.site.argumentresolver.InternalJsonParam;
import com.tss.report.interfaces.task.TaskInterface;
import com.tss.report.interfaces.task.vo.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
    public TaskDetailRespVO getTaskDetail(@InternalJsonParam(validation = true) TaskDetailReqVO param) {
        return taskInterface.getTaskDetail(param);
    }

    @ApiOperation(value = "创建实验任务", notes = "创建实验任务")
    @RequestMapping(value = "/createTask", method = RequestMethod.POST)
    public Long createTask(@InternalJsonParam(validation = true) TaskCreateReqVO param) {
        return taskInterface.createTask(param);
    }

    @ApiOperation(value = "更新实验任务", notes = "更新实验任务")
    @RequestMapping(value = "/updateTask", method = RequestMethod.POST)
    public Boolean updateTask(@InternalJsonParam(validation = true) TaskUpdateReqVO param) {
        return taskInterface.updateTask(param);
    }

    @ApiOperation(value = "实验任务列表", notes = "实验任务列表（分页）")
    @RequestMapping(value = "/getTaskList", method = RequestMethod.POST)
    public PageInfo<TeacherTaskRespVO> getTaskList(@InternalJsonParam(validation = true) TeacherTaskReqVO param) {
        return taskInterface.getTeacherTaskList(param);
    }

    @ApiOperation(value = "发布实验任务", notes = "发布实验任务")
    @RequestMapping(value = "/publishTask/{taskId}", method = RequestMethod.GET)
    public Boolean publishTask(@PathVariable("taskId") Long taskId) {
        return taskInterface.publishTask(taskId);
    }
}
