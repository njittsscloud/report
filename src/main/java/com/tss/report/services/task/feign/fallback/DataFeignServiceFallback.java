package com.tss.report.services.task.feign.fallback;

import com.tss.report.interfaces.task.vo.TeacherCourseCurriculumProjectRespVO;
import com.tss.report.services.task.feign.DataFeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DataFeignServiceFallback implements DataFeignService {
    private static final Logger LOG = LoggerFactory.getLogger(DataFeignServiceFallback.class);

    @Override
    public TeacherCourseCurriculumProjectRespVO getTeacherCourseCurriculumProjectList(Long teacherId) {
        LOG.error("getTeacherCourseCurriculumProjectList fail, teacherId={}", teacherId);
        return new TeacherCourseCurriculumProjectRespVO();
    }
}
