package com.tss.report.services.report;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tss.basic.common.util.ModelMapperUtil;
import com.tss.basic.site.util.TSSAssert;
import com.tss.report.interfaces.report.ReportInterface;
import com.tss.report.interfaces.report.enums.ReportCorrectEnum;
import com.tss.report.interfaces.report.vo.*;
import com.tss.report.services.report.dao.ReportDao;
import com.tss.report.services.report.po.Report;
import com.tss.report.services.task.dao.TaskDao;
import com.tss.report.services.task.po.Task;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class ReportService implements ReportInterface {
    private static final Logger LOG = LoggerFactory.getLogger(ReportService.class);

    @Autowired
    private ReportDao reportDao;
    @Autowired
    private TaskDao taskDao;

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

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Long studentUploadReport(StudentUploadReportReqVO param) {
        Report report = ModelMapperUtil.strictMap(param, Report.class);
        report.setSubmitTime(new Date());
        report.setCreateTime(new Date());
        report.setUpdateTime(new Date());
        int count = reportDao.insert(report);
        TSSAssert.isTrue(count > 0 && report.getId() != null, "保存实验报告失败！");
        return report.getId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean teacherCorrectReport(TeacherCorrectReportReqVO param) {
        Report report = reportDao.findById(param.getReportId());
        TSSAssert.isNotNull(report, "无效的报告id");
        
        Report correct = new Report();
        correct.setId(param.getReportId());
        correct.setCorrectStatus(this.correctStatus(report.getCorrectStatus()));
        correct.setCorrectContent(param.getCorrectContent());
        correct.setScoreType(param.getScoreType());
        correct.setScore(param.getScore());
        correct.setUpdateTime(new Date());
        int count = reportDao.update(correct);
        return count > 0;
    }

    private Integer correctStatus(Integer correctStatus) {
        return (correctStatus == ReportCorrectEnum.WAIT.value() || correctStatus == ReportCorrectEnum.UN_PUBLISH.value()) ? 
                ReportCorrectEnum.UN_PUBLISH.value() : ReportCorrectEnum.PUBLISH.value();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean teacherPublishReport(TeacherPublishReportReqVO param) {
        int count = reportDao.publishReport(param.getReportIds());
        return count > 0;
    }

    @Override
    public GetStudentReportDetailByTaskIdRespVO getReportDetailByTaskId(GetStudentReportDetailByTaskIdReqVO param) {
        Task task = taskDao.findById(param.getTaskId());
        TSSAssert.isNotNull(task, "无效的实验任务id");

        GetStudentReportDetailByTaskIdRespVO resp = new GetStudentReportDetailByTaskIdRespVO();
        resp.setReportName(task.getName() + "-" + param.getStudentNo());
        resp.setTaskId(task.getId());
        resp.setTaskName(task.getName());
        resp.setTeacherId(task.getTeacherId());
        resp.setTeacherName(task.getTeacherName());
        resp.setCurriculumName(task.getCurriculumName());
        resp.setStudentId(param.getStudentId());
        resp.setStudentName(param.getStudentName());
        resp.setStudentNo(param.getStudentNo());
        resp.setClassId(param.getClassId());
        resp.setClassName(param.getClassName());
        return resp;
    }

    @Override
    public GetStudentReportDetailByReportIdRespVO getReportDetailByReportId(Long reportId) {
        Report report = reportDao.findById(reportId);
        TSSAssert.isNotNull(report, "无效的实验报告id");
        Task task = taskDao.findById(report.getTaskId());
        TSSAssert.isNotNull(report, "无效的实验任务id");
        
        GetStudentReportDetailByReportIdRespVO resp = ModelMapperUtil.strictMap(report, GetStudentReportDetailByReportIdRespVO.class);
        resp.setReportId(report.getId());
        resp.setTeacherId(task.getTeacherId());
        resp.setTeacherName(task.getTeacherName());
        resp.setCurriculumName(task.getCurriculumName());
        resp.setCorrectStatusDesc(ReportCorrectEnum.getDescByValue(report.getCorrectStatus()));
        return resp;
    }

    @Override
    public GetReportCorrectInfoByReportIdRespVO getReportCorrectInfoByReportId(Long reportId) {
        Report report = reportDao.findById(reportId);
        TSSAssert.isNotNull(report, "无效的实验报告id");
        Task task = taskDao.findById(report.getTaskId());
        TSSAssert.isNotNull(report, "无效的实验任务id");

        GetReportCorrectInfoByReportIdRespVO resp = ModelMapperUtil.strictMap(report, GetReportCorrectInfoByReportIdRespVO.class);
        resp.setReportId(report.getId());
        resp.setCurriculumName(task.getCurriculumName());
        resp.setCorrectStatusDesc(ReportCorrectEnum.getDescByValue(report.getCorrectStatus()));
        return resp;
    }
}
