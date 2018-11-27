package com.tss.report.interfaces.task.vo;

import com.tss.basic.site.page.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: MQG
 * @date: 2018/11/27
 */
@ApiModel("查询教师实验任务请求参数")
public class TeacherTaskReqVO {

    @ApiModelProperty(value = "学年", example = "2018-2019")
    private String year;

    @ApiModelProperty(value = "学期", example = "1")
    private Integer term;

    @ApiModelProperty(value = "课程分配id", example = "1")
    private Long courseId;

    @ApiModelProperty(value = "教师id", example = "1")
    private Long teacherId;

    @ApiModelProperty(value = "状态 0全部 1待发布 2已发布", example = "0")
    private Integer status;

    @ApiModelProperty("分页参数信息")
    private PageParam pageParam;

    public PageParam getPageParam() {
        return pageParam;
    }

    public void setPageParam(PageParam pageParam) {
        this.pageParam = pageParam;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
