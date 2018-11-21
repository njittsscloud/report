package com.tss.report.interfaces.task.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author: MQG
 * @date: 2018/11/21
 */
@ApiModel
public class TeacherCourseCurriculumProjectRespVO {
    
    @ApiModelProperty(value = "课程项目列表")
    private List<CourseCurriculumProject> courseProjectList;

    public static class CourseCurriculumProject {

        @ApiModelProperty(value = "课程分配id")
        private Long courseId;

        @ApiModelProperty(value = "课程id")
        private Long curriculumId;

        @ApiModelProperty(value = "课程名称")
        private String curriculumName;

        @ApiModelProperty(value = "实验项目列表")
        private List<CurriculumProjectBaseInfo> projectInfoList;

        public Long getCourseId() {
            return courseId;
        }

        public void setCourseId(Long courseId) {
            this.courseId = courseId;
        }

        public Long getCurriculumId() {
            return curriculumId;
        }

        public void setCurriculumId(Long curriculumId) {
            this.curriculumId = curriculumId;
        }

        public String getCurriculumName() {
            return curriculumName;
        }

        public void setCurriculumName(String curriculumName) {
            this.curriculumName = curriculumName;
        }

        public List<CurriculumProjectBaseInfo> getProjectInfoList() {
            return projectInfoList;
        }

        public void setProjectInfoList(List<CurriculumProjectBaseInfo> projectInfoList) {
            this.projectInfoList = projectInfoList;
        }
    }

    public static class CurriculumProjectBaseInfo {

        @ApiModelProperty(value = "实验项目id")
        private Long projectId;

        @ApiModelProperty(value = "实验项目名称")
        private String projectName;

        public Long getProjectId() {
            return projectId;
        }

        public void setProjectId(Long projectId) {
            this.projectId = projectId;
        }

        public String getProjectName() {
            return projectName;
        }

        public void setProjectName(String projectName) {
            this.projectName = projectName;
        }
    }


    public List<CourseCurriculumProject> getCourseProjectList() {
        return courseProjectList;
    }

    public void setCourseProjectList(List<CourseCurriculumProject> courseProjectList) {
        this.courseProjectList = courseProjectList;
    }
}
