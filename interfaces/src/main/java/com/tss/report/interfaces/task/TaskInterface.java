package com.tss.report.interfaces.task;

import com.github.pagehelper.PageInfo;
import com.tss.report.interfaces.task.vo.*;

public interface TaskInterface {

    TaskDetailRespVO getTaskDetail(TaskDetailReqVO param);

    Long createTask(TaskCreateReqVO param);

    void updateTask(TaskUpdateReqVO param);

    PageInfo<TeacherTaskRespVO> getTeacherTaskList(TeacherTaskReqVO param);

    Boolean publishTask(Long taskId);
}
