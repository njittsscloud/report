package com.tss.report.services.task;

import com.tss.report.interfaces.task.TaskInterface;
import com.tss.report.interfaces.task.po.TaskDetailReqVO;
import com.tss.report.interfaces.task.po.TaskDetailRespVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TaskService implements TaskInterface {
    public static final Logger LOG = LoggerFactory.getLogger(TaskService.class);


    @Override
    public TaskDetailRespVO getTaskDetail(TaskDetailReqVO param) {
        // 调用data系统 获取教师课程分配和课表信息
        return null;
    }
}
