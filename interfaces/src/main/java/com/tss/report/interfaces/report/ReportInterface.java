package com.tss.report.interfaces.report;

import com.github.pagehelper.PageInfo;
import com.tss.report.interfaces.report.vo.TeacherReportReqVO;
import com.tss.report.interfaces.report.vo.TeacherReportRespVO;

public interface ReportInterface {
    PageInfo<TeacherReportRespVO> getTeacherReportList(TeacherReportReqVO param);
}
