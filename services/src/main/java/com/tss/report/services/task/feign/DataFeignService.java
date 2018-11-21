package com.tss.report.services.task.feign;

import com.tss.report.services.task.feign.fallback.DataFeignServiceFallback;
import com.tss.report.interfaces.task.vo.TeacherCourseCurriculumProjectRespVO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "${data.serviceId}", fallback = DataFeignServiceFallback.class)
public interface DataFeignService {

    @RequestMapping(value = "/curriculum/project/getCourseCurriculumProjectList/{teacherId}", method = RequestMethod.GET)
    TeacherCourseCurriculumProjectRespVO getTeacherCourseCurriculumProjectList(@PathVariable("teacherId") Long teacherId);

}
