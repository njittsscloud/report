package com.tss.report.interfaces.report.vo;

import com.tss.basic.site.page.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

@ApiModel("教师获取报告列表查询参数")
public class TeacherReportReqVO {

    @ApiModelProperty(value = "学年", example = "2018-2019")
    @NotEmpty(message = "学年不能为空")
    private String year;

    @ApiModelProperty(value = "学期", example = "1")
    @Range(min = 1, max = 2, message = "学期参数无效")
    private Integer term;

    @ApiModelProperty(value = "教师id", example = "1")
    @NotNull(message = "教师id不能为空")
    private Long teacherId;

    @ApiModelProperty(value = "课程分配id", example = "1")
    private Long courseId;

    @ApiModelProperty(value = "实验任务id", example = "1")
    private Long taskId;

    @ApiModelProperty(value = "班级id", example = "1")
    private Long classId;

    @ApiModelProperty(value = "批阅状态 0全部 1待批阅 2待发布 3已发布", example = "0")
    private Integer correctStatus;

    @ApiModelProperty(value = "分页参数", example = "{'pageNum':1, 'pageSize':10}")
    @NotNull(message = "无分页参数信息")
    private PageParam pageParam;

    public PageParam getPageParam() {
        return pageParam;
    }

    public void setPageParam(PageParam pageParam) {
        this.pageParam = pageParam;
    }

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

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
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
}
