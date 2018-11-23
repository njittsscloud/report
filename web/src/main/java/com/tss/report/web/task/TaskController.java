package com.tss.report.web.task;

import com.tss.basic.site.argumentresolver.JsonParam;
import com.tss.report.interfaces.task.TaskInterface;
import com.tss.report.interfaces.task.vo.TaskDetailReqVO;
import com.tss.report.interfaces.task.vo.TaskDetailRespVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "实验任务模块", tags = "TaskController", description = "实验任务模块")
@RestController
@RequestMapping("/task")
public class TaskController {
    private static final Logger LOG = LoggerFactory.getLogger(TaskController.class);

    @Autowired
    private TaskInterface taskInterface;

    @ApiOperation(value = "实验任务详情", notes = "实验任务详情")
    @RequestMapping(value = "/getTaskDetail", method = RequestMethod.POST)
    public TaskDetailRespVO getTaskDetail(@JsonParam(validation = true) TaskDetailReqVO param) {
        return taskInterface.getTaskDetail(param);
    }

}
