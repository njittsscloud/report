package com.tss.report.interfaces.task;

import com.tss.report.interfaces.task.po.TaskDetailReqVO;
import com.tss.report.interfaces.task.po.TaskDetailRespVO;

public interface TaskInterface {
    TaskDetailRespVO getTaskDetail(TaskDetailReqVO param);
}
