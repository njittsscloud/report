package com.tss.report.services.task.dao;

import com.tss.report.services.task.po.TaskClass;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TaskClassDao {

    int insert(TaskClass record);

    TaskClass findById(Long id);

    int update(TaskClass record);

    List<TaskClass> findByTaskId(Long taskId);

    int deleteByTaskId(Long taskId);
}