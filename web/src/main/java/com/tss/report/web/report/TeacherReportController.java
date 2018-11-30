package com.tss.report.web.report;

import com.github.pagehelper.PageInfo;
import com.tss.basic.site.argumentresolver.InternalJsonParam;
import com.tss.report.interfaces.report.ReportInterface;
import com.tss.report.interfaces.report.vo.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "教师报告模块", tags = "TeacherReportController", description = "教师报告模块")
@RestController
@RequestMapping("/report/teacher")
public class TeacherReportController {
    private static final Logger LOG = LoggerFactory.getLogger(TeacherReportController.class);

    @Autowired
    private ReportInterface reportInterface;

    @ApiOperation(value = "教师查询报告列表", notes = "教师查询报告列表")
    @RequestMapping(value = "/getTeacherReportList", method = RequestMethod.POST)
    public PageInfo<TeacherReportRespVO> getTeacherReportList(@InternalJsonParam(validation = true) TeacherReportReqVO param) {
        return reportInterface.getTeacherReportList(param);
    }

    @ApiOperation(value = "教师批阅报告", notes = "教师批阅报告")
    @RequestMapping(value = "/correctReport", method = RequestMethod.POST)
    public Boolean correctReport(@InternalJsonParam(validation = true) TeacherCorrectReportReqVO param) {
        return reportInterface.teacherCorrectReport(param);
    }

    @ApiOperation(value = "教师发布成绩", notes = "教师发布成绩")
    @RequestMapping(value = "/publishReport", method = RequestMethod.POST)
    public Boolean correctReport(@InternalJsonParam(validation = true) TeacherPublishReportReqVO param) {
        return reportInterface.teacherPublishReport(param);
    }

    @ApiOperation(value = "根据报告id查询报告批阅信息", notes = "根据报告id查询报告批阅信息（批阅页面）")
    @RequestMapping(value = "/getCorrectInfoByReportId/{reportId}", method = RequestMethod.GET)
    public GetReportCorrectInfoByReportIdRespVO getReportDetailByReportId(@PathVariable Long reportId) {
        return reportInterface.getReportCorrectInfoByReportId(reportId);
    }

}
