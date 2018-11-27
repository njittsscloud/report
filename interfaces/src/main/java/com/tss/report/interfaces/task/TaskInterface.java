package com.tss.report.interfaces.task;

import com.tss.report.interfaces.task.vo.TaskCreateReqVO;
import com.tss.report.interfaces.task.vo.TaskDetailReqVO;
import com.tss.report.interfaces.task.vo.TaskDetailRespVO;
import com.tss.report.interfaces.task.vo.TaskUpdateReqVO;

public interface TaskInterface {

    TaskDetailRespVO getTaskDetail(TaskDetailReqVO param);

    Long createTask(TaskCreateReqVO param);

    void updateTask(TaskUpdateReqVO param);
}
