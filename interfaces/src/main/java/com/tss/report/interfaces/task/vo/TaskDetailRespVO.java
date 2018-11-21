package com.tss.report.interfaces.task.vo;

import io.swagger.annotations.ApiModel;

import java.util.List;

@ApiModel("实验任务详情响应参数")
public class TaskDetailRespVO {

    private List<TeacherCourseCurriculumProjectRespVO.CourseCurriculumProject> courseProjectList;

    public List<TeacherCourseCurriculumProjectRespVO.CourseCurriculumProject> getCourseProjectList() {
        return courseProjectList;
    }

    public void setCourseProjectList(List<TeacherCourseCurriculumProjectRespVO.CourseCurriculumProject> courseProjectList) {
        this.courseProjectList = courseProjectList;
    }
}
