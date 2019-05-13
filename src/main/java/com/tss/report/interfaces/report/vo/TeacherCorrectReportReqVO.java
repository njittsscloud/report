package com.tss.report.interfaces.report.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

@ApiModel("教师批阅报告参数")
public class TeacherCorrectReportReqVO {

    @ApiModelProperty(value = "报告id", example = "1")
    @NotNull(message = "报告id不能为空")
    private Long reportId;

    @ApiModelProperty(value = "批阅内容", example = "很好")
    @NotEmpty(message = "批阅内容不能为空")
    private String correctContent;

    @ApiModelProperty(value = "分数类型 1等第制 2百分制", example = "1")
    @Range(min = 1, max = 2, message = "分数类型参数无效")
    private Integer scoreType;

    @ApiModelProperty(value = "分数", example = "优秀")
    @NotEmpty(message = "分数不能为空")
    private String score;

    @ApiModelProperty(value = "教师id", example = "1")
    @NotNull(message = "教师id不能为空")
    private Long teacherId;

    public Long getReportId() {
        return reportId;
    }

    public void setReportId(Long reportId) {
        this.reportId = reportId;
    }

    public String getCorrectContent() {
        return correctContent;
    }

    public void setCorrectContent(String correctContent) {
        this.correctContent = correctContent;
    }

    public Integer getScoreType() {
        return scoreType;
    }

    public void setScoreType(Integer scoreType) {
        this.scoreType = scoreType;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
}
