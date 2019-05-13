package com.tss.report.interfaces.task.vo;

import com.tss.basic.site.page.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author: MQG
 * @date: 2018/11/27
 */
@ApiModel("查询学生实验任务请求参数")
public class StudentTaskReqVO {

    @ApiModelProperty(value = "学年", example = "2018-2019")
    private String year;

    @ApiModelProperty(value = "学期", example = "1")
    private Integer term;

    @ApiModelProperty(value = "课程分配id集合", example = "[1, 2]")
    private List<Long> courseIds;

    @ApiModelProperty("分页参数信息")
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


    public List<Long> getCourseIds() {
        return courseIds;
    }

    public void setCourseIds(List<Long> courseIds) {
        this.courseIds = courseIds;
    }
}
