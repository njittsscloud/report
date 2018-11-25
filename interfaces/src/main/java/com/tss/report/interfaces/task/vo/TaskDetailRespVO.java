package com.tss.report.interfaces.task.vo;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

@ApiModel("实验任务详情响应参数")
public class TaskDetailRespVO {

    @ApiModelProperty("实验任务id")
    private Long taskId;

    @ApiModelProperty("学年")
    private String year;

    @ApiModelProperty("学期")
    private Integer term;

    @ApiModelProperty("课程分配id")
    private Long courseId;

    @ApiModelProperty("课程名称")
    private String curriculumName;

    @ApiModelProperty("实验任务名称")
    private String taskName;

    @ApiModelProperty("开始时间")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date beginTime;

    @ApiModelProperty("截止时间")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date deadlineTime;

    @ApiModelProperty("描述")
    private String desc;

    @ApiModelProperty("实验班级id列表")
    private List<Long> classIds;

    @ApiModelProperty("附件名称")
    private String attachName;

    @ApiModelProperty("附件路径")
    private String attachUrl;

    @ApiModelProperty("课程列表")
    private List<TeacherCourseCurriculumProjectRespVO.CourseCurriculumProject> courseProjectList;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCurriculumName() {
        return curriculumName;
    }

    public void setCurriculumName(String curriculumName) {
        this.curriculumName = curriculumName;
    }

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<Long> getClassIds() {
        return classIds;
    }

    public void setClassIds(List<Long> classIds) {
        this.classIds = classIds;
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

    public List<TeacherCourseCurriculumProjectRespVO.CourseCurriculumProject> getCourseProjectList() {
        return courseProjectList;
    }

    public void setCourseProjectList(List<TeacherCourseCurriculumProjectRespVO.CourseCurriculumProject> courseProjectList) {
        this.courseProjectList = courseProjectList;
    }
}
