package com.tss.report.interfaces.report;

import com.github.pagehelper.PageInfo;
import com.tss.report.interfaces.report.vo.StudentReportReqVO;
import com.tss.report.interfaces.report.vo.StudentReportRespVO;
import com.tss.report.interfaces.report.vo.TeacherReportReqVO;
import com.tss.report.interfaces.report.vo.TeacherReportRespVO;

public interface ReportInterface {
    PageInfo<TeacherReportRespVO> getTeacherReportList(TeacherReportReqVO param);

    PageInfo<StudentReportRespVO> getStudentReportList(StudentReportReqVO param);
}
