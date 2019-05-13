package com.tss.report.web.task;

import com.github.pagehelper.PageInfo;
import com.tss.basic.site.argumentresolver.InternalJsonParam;
import com.tss.report.interfaces.task.TaskInterface;
import com.tss.report.interfaces.task.vo.StudentTaskReqVO;
import com.tss.report.interfaces.task.vo.StudentTaskRespVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "学生实验任务模块", tags = "StudentTaskController", description = "学生实验任务模块")
@RestController
@RequestMapping("/task/student")
public class StudentTaskController {

    @Autowired
    private TaskInterface taskInterface;

    @ApiOperation(value = "实验任务列表", notes = "实验任务列表（分页）")
    @RequestMapping(value = "/getTaskList", method = RequestMethod.POST)
    public PageInfo<StudentTaskRespVO> getTaskList(@InternalJsonParam(validation = true) StudentTaskReqVO param) {
        return taskInterface.getStudentTaskList(param);
    }
}
