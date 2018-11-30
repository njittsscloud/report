package com.tss.report.services.report.dao;


import com.tss.report.interfaces.report.vo.StudentReportReqVO;
import com.tss.report.interfaces.report.vo.StudentReportRespVO;
import com.tss.report.interfaces.report.vo.TeacherReportReqVO;
import com.tss.report.interfaces.report.vo.TeacherReportRespVO;
import com.tss.report.services.report.po.Report;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReportDao {

    int insert(Report record);

    Report findById(Long id);

    int update(Report record);

    List<TeacherReportRespVO> getTeacherReportList(TeacherReportReqVO param);

    List<StudentReportRespVO> getStudentReportList(StudentReportReqVO param);

    int publishReport(List<Long> reportIds);
}