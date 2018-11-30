package com.tss.report.services.report;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tss.report.interfaces.report.ReportInterface;
import com.tss.report.interfaces.report.vo.StudentReportReqVO;
import com.tss.report.interfaces.report.vo.StudentReportRespVO;
import com.tss.report.interfaces.report.vo.TeacherReportReqVO;
import com.tss.report.interfaces.report.vo.TeacherReportRespVO;
import com.tss.report.services.report.dao.ReportDao;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService implements ReportInterface {
    private static final Logger LOG = LoggerFactory.getLogger(ReportService.class);

    @Autowired
    private ReportDao reportDao;

    @Override
    public PageInfo<TeacherReportRespVO> getTeacherReportList(TeacherReportReqVO param) {
        PageHelper.startPage(param.getPageParam().getPageNum(), param.getPageParam().getPageSize());
        List<TeacherReportRespVO> reportList = reportDao.getTeacherReportList(param);
        if (CollectionUtils.isNotEmpty(reportList)) {
            return PageInfo.of(reportList);
        }
        return new PageInfo<>();
    }

    @Override
    public PageInfo<StudentReportRespVO> getStudentReportList(StudentReportReqVO param) {
        PageHelper.startPage(param.getPageParam().getPageNum(), param.getPageParam().getPageSize());
        List<StudentReportRespVO> reportList = reportDao.getStudentReportList(param);
        if (CollectionUtils.isNotEmpty(reportList)) {
            return PageInfo.of(reportList);
        }
        return new PageInfo<>();
    }
}
