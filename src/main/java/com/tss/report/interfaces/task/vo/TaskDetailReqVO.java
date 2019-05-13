package com.tss.report.interfaces.task.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@ApiModel("实验任务详情查询参数")
public class TaskDetailReqVO {

    @ApiModelProperty(value = "实验任务id", example = "1")
    @NotNull(message = "实验任务id不能为空")
    public Long taskId;

    @ApiModelProperty(value = "教师id", example = "1")
    @NotNull(message = "教师id不能为空")
    public Long teacherId;
    
    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
}
