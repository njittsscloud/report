package com.tss.report.interfaces.report.vo;

import com.tss.basic.site.page.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

@ApiModel("学生获取报告列表查询参数")
public class StudentReportReqVO {

    @ApiModelProperty(value = "学年", example = "2018-2019")
    @NotEmpty(message = "学年不能为空")
    private String year;

    @ApiModelProperty(value = "学期", example = "1")
    @Range(min = 1, max = 2, message = "学期参数无效")
    private Integer term;

    @ApiModelProperty(value = "学生id", example = "1")
    @NotNull(message = "学生id不能为空")
    private Long studentId;

    @ApiModelProperty(value = "课程分配id", example = "1")
    private Long courseId;

    @ApiModelProperty(value = "实验任务id", example = "1")
    private Long taskId;

    @ApiModelProperty(value = "分页参数", example = "{'pageNum':1, 'pageSize':10}")
    @NotNull(message = "无分页信息")
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

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}
