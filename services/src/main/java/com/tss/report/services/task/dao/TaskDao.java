package com.tss.report.services.task.dao;

import com.tss.report.services.task.po.Task;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TaskDao {

    int insert(Task record);

    Task findById(Long id);

    int update(Task record);

}