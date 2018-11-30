package com.tss.report.interfaces.report.vo;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel("学生获取报告列表响应参数")
public class StudentReportRespVO {

    @ApiModelProperty("报告id")
    private Long reportId;

    @ApiModelProperty("报告名称")
    private String reportName;

    @ApiModelProperty("文件名称")
    private String fileName;

    @ApiModelProperty("文件路径")
    private String filePath;

    @ApiModelProperty("提交时间")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date submitTime;

    @ApiModelProperty("教师id")
    private Long teacherId;

    @ApiModelProperty("教师姓名")
    private String teacherName;

    @ApiModelProperty("实验任务id")
    private Long taskId;

    @ApiModelProperty("实验任务名称")
    private String taskName;

    @ApiModelProperty("课程名称")
    private String curriculumName;

    @ApiModelProperty("分数")
    private String score;

    @ApiModelProperty("批阅状态 1待批阅 2待发布 3已发布")
    private Integer correctStatus;

    public Long getReportId() {
        return reportId;
    }

    public void setReportId(Long reportId) {
        this.reportId = reportId;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
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

    public String getCurriculumName() {
        return curriculumName;
    }

    public void setCurriculumName(String curriculumName) {
        this.curriculumName = curriculumName;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Integer getCorrectStatus() {
        return correctStatus;
    }

    public void setCorrectStatus(Integer correctStatus) {
        this.correctStatus = correctStatus;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
