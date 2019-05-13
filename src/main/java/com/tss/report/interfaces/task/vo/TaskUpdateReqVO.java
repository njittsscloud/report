package com.tss.report.interfaces.task.vo;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@ApiModel("更新实验任务请求参数")
public class TaskUpdateReqVO {

    @ApiModelProperty(value = "实验任务id", example = "1")
    @NotNull(message = "实验任务id不能为空")
    private Long id;

    @ApiModelProperty(value = "实验任务名称", example = "链表")
    @NotBlank(message = "实验任务名称不能为空")
    private String name;

    @ApiModelProperty(value = "名称类型 1实验项目 2手动输入", example = "1")
    @Range(min = 1, max = 2, message = "无效的名称类型")
    private String nameType;

    @ApiModelProperty(value = "开始时间", example = "2019-01-01 01:00:00")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @NotNull
    private Date beginTime;

    @ApiModelProperty(value = "截止时间", example = "2019-01-01 01:00:00")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @NotNull
    private Date deadlineTime;

    @ApiModelProperty(value = "附件名称", example = "报告.doc")
    @NotNull
    private String attachName;

    @ApiModelProperty(value = "附件路径", example = "abcdefg")
    @NotNull
    private String attachUrl;

    @ApiModelProperty(value = "描述", example = "描述")
    @NotNull
    private String desc;

    @ApiModelProperty(value = "实验班级集合", example = "[{'classId':1, 'className':'软嵌142'}]")
    @NotEmpty(message = "实验班级不能为空")
    private List<ClassBaseInfoVO> classList;

    @ApiModelProperty(value = "教师id", example = "1")
    @NotNull
    private Long teacherId;

    @ApiModelProperty(value = "教师姓名", example = "张三")
    @NotBlank(message = "教师姓名不能为空")
    private String teacherName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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

    public List<ClassBaseInfoVO> getClassList() {
        return classList;
    }

    public void setClassList(List<ClassBaseInfoVO> classList) {
        this.classList = classList;
    }
}
