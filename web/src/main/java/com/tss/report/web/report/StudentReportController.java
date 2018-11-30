package com.tss.report.web.report;

import com.github.pagehelper.PageInfo;
import com.tss.basic.site.argumentresolver.InternalJsonParam;
import com.tss.report.interfaces.report.ReportInterface;
import com.tss.report.interfaces.report.vo.StudentReportReqVO;
import com.tss.report.interfaces.report.vo.StudentReportRespVO;
import com.tss.report.interfaces.report.vo.StudentUploadReportReqVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "学生报告模块", tags = "StudentReportController", description = "学生报告模块")
@RestController
@RequestMapping("/report/student")
public class StudentReportController {
    private static final Logger LOG = LoggerFactory.getLogger(StudentReportController.class);

    @Autowired
    private ReportInterface reportInterface;

    @ApiOperation(value = "学生查询报告列表", notes = "学生查询报告列表")
    @RequestMapping(value = "/getStudentReportList", method = RequestMethod.POST)
    public PageInfo<StudentReportRespVO> getStudentReportList(@InternalJsonParam(validation = true) StudentReportReqVO param) {
        return reportInterface.getStudentReportList(param);
    }

    @ApiOperation(value = "上传报告", notes = "上传报告")
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public Long getStudentReportList(@InternalJsonParam(validation = true) StudentUploadReportReqVO param) {
        return reportInterface.studentUploadReport(param);
    }

}
