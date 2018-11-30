package com.tss.report.interfaces.report.vo;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel("根据报告id查询学生报告详情响应参数")
public class GetReportCorrectInfoByReportIdRespVO {

    @ApiModelProperty("报告id")
    private Long reportId;

    @ApiModelProperty("报告名称")
    private String reportName;

    @ApiModelProperty("文件名称")
    private String fileName;

    @ApiModelProperty("文件路径")
    private String filePath;

    @ApiModelProperty("描述")
    private String desc;

    @ApiModelProperty("提交时间")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date submitTime;

    @ApiModelProperty("分数类型 1等第制 2百分制")
    private Integer scoreType;  

    @ApiModelProperty("分数")
    private String score;

    @ApiModelProperty("批阅状态 1待批阅 2待发布 3已发布")
    private Integer correctStatus;

    @ApiModelProperty("批阅状态描述")
    private String correctStatusDesc;

    @ApiModelProperty("批阅内容")
    private String correctContent;

    @ApiModelProperty("实验任务id")
    private Long taskId;

    @ApiModelProperty("实验任务名称")
    private String taskName;

    @ApiModelProperty("课程名称")
    private String curriculumName;

    @ApiModelProperty("学生id")
    private Long studentId;

    @ApiModelProperty("学生姓名")
    private String studentName;

    @ApiModelProperty("学号")
    private String studentNo;

    @ApiModelProperty("班级id")
    private Long classId;

    @ApiModelProperty("班级名称")
    private String className;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCorrectContent() {
        return correctContent;
    }

    public void setCorrectContent(String correctContent) {
        this.correctContent = correctContent;
    }

    public String getCorrectStatusDesc() {
        return correctStatusDesc;
    }

    public void setCorrectStatusDesc(String correctStatusDesc) {
        this.correctStatusDesc = correctStatusDesc;
    }

    public Integer getScoreType() {
        return scoreType;
    }

    public void setScoreType(Integer scoreType) {
        this.scoreType = scoreType;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
