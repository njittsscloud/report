package com.tss.report.interfaces.task.vo;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

/**
 * @author: MQG
 * @date: 2018/11/27
 */
@ApiModel("查询教师实验任务响应参数")
public class TeacherTaskRespVO {

    @ApiModelProperty(value = "实验任务id", example = "1")
    private Long taskId;

    @ApiModelProperty(value = "实验任务名称", example = "链表")
    private String taskName;

    @ApiModelProperty(value = "课程名称", example = "数据结构")
    private String curriculumName;

    @ApiModelProperty(value = "发布时间", example = "2018-11-27 12:00:00")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date publishTime;

    @ApiModelProperty(value = "开始时间", example = "2018-11-27 12:00:00")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date beginTime;

    @ApiModelProperty(value = "截止时间", example = "2018-11-27 12:00:00")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date deadlineTime;

    @ApiModelProperty(value = "实验班级", example = "[{'软嵌142'}]")
    private List<String> classNames;

    @ApiModelProperty(value = "附件名称", example = "aa.txt")
    private String attachName;

    @ApiModelProperty(value = "附件url", example = "abcdefg")
    private String attachUrl;

    @ApiModelProperty(value = "描述", example = "abcdefg")
    private String desc;

    @ApiModelProperty(value = "状态 1待发布 2已发布", example = "1")
    private Integer status;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getCurriculumName() {
        return curriculumName;
    }

    public void setCurriculumName(String curriculumName) {
        this.curriculumName = curriculumName;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getDeadlineTime() {
        return deadlineTime;
    }

    public void setDeadlineTime(Date deadlineTime) {
        this.deadlineTime = deadlineTime;
    }

    public List<String> getClassNames() {
        return classNames;
    }

    public void setClassNames(List<String> classNames) {
        this.classNames = classNames;
    }

    public String getAttachName() {
        return attachName;
    }

    public void setAttachName(String attachName) {
        this.attachName = attachName;
    }

    public String getAttachUrl() {
        return attachUrl;
    }

    public void setAttachUrl(String attachUrl) {
        this.attachUrl = attachUrl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
