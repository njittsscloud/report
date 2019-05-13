package com.tss.report.interfaces.report.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

@ApiModel("学生上传报告参数")
public class StudentUploadReportReqVO {

    @ApiModelProperty(value = "报告名称 格式：实验任务名称-学号", example = "链表-20181130001")
    @NotEmpty(message = "报告名称不能为空")
    private String reportName;

    @ApiModelProperty(value = "文件名称", example = "abc.pdf")
    @NotEmpty(message = "文件名称不能为空")
    private String fileName;

    @ApiModelProperty(value = "文件路径", example = "abcdefg")
    @NotEmpty(message = "文件路径不能为空")
    private String filePath;

    @ApiModelProperty(value = "课程分配id", example = "1")
    @NotNull(message = "课程分配id不能为空")
    private Long courseId;

    @ApiModelProperty(value = "实验任务id", example = "1")
    @NotNull(message = "实验任务id不能为空")
    private Long taskId;

    @ApiModelProperty(value = "实验任务名称", example = "链表")
    @NotEmpty(message = "实验任务名称不能为空")
    private String taskName;

    @ApiModelProperty(value = "学生id", example = "1")
    @NotNull(message = "学生id不能为空")
    private Long studentId;

    @ApiModelProperty(value = "学生姓名", example = "张三")
    @NotEmpty(message = "学生姓名不能为空")
    private String studentName;

    @ApiModelProperty(value = "学号", example = "20181130001")
    @NotEmpty(message = "学号不能为空")
    private String studentNo;

    @ApiModelProperty(value = "班级id", example = "1")
    @NotNull(message = "班级id不能为空")
    private Long classId;

    @ApiModelProperty(value = "班级名称", example = "测试班级")
    @NotEmpty(message = "班级名称不能为空")
    private String className;

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

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
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
