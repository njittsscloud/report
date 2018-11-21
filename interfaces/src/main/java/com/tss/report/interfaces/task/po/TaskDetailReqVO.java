package com.tss.report.interfaces.task.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("实验任务详情查询参数")
public class TaskDetailReqVO {

    @ApiModelProperty(value = "实验任务id", example = "1")
    public Long taskId;

    @ApiModelProperty(value = "教师id", example = "1")
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
