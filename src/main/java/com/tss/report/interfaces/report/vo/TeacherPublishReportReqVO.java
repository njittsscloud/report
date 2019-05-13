package com.tss.report.interfaces.report.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;

@ApiModel("教师发布成绩参数")
public class TeacherPublishReportReqVO {

    @ApiModelProperty(value = "报告id集合", example = "[1, 2]")
    @NotEmpty(message = "报告id不能为空")
    private List<Long> reportIds;
    
    @ApiModelProperty(value = "教师id", example = "1")
    @NotNull(message = "教师id不能为空")
    private Long teacherId;

    public List<Long> getReportIds() {
        return reportIds;
    }

    public void setReportIds(List<Long> reportIds) {
        this.reportIds = reportIds;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
}
