package com.tss.report.web.report;

import com.github.pagehelper.PageInfo;
import com.tss.basic.site.argumentresolver.InternalJsonParam;
import com.tss.report.interfaces.report.ReportInterface;
import com.tss.report.interfaces.report.vo.TeacherReportReqVO;
import com.tss.report.interfaces.report.vo.TeacherReportRespVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

}
