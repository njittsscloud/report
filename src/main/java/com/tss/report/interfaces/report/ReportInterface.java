package com.tss.report.interfaces.report;

import com.github.pagehelper.PageInfo;
import com.tss.report.interfaces.report.vo.*;

public interface ReportInterface {
    PageInfo<TeacherReportRespVO> getTeacherReportList(TeacherReportReqVO param);

    PageInfo<StudentReportRespVO> getStudentReportList(StudentReportReqVO param);

    Long studentUploadReport(StudentUploadReportReqVO param);

    Boolean teacherCorrectReport(TeacherCorrectReportReqVO param);

    Boolean teacherPublishReport(TeacherPublishReportReqVO param);

    GetStudentReportDetailByTaskIdRespVO getReportDetailByTaskId(GetStudentReportDetailByTaskIdReqVO param);

    GetStudentReportDetailByReportIdRespVO getReportDetailByReportId(Long reportId);

    GetReportCorrectInfoByReportIdRespVO getReportCorrectInfoByReportId(Long reportId);
}
