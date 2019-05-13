package com.tss.report.services.task.dao;

import com.tss.report.interfaces.task.vo.StudentTaskReqVO;
import com.tss.report.interfaces.task.vo.StudentTaskRespVO;
import com.tss.report.interfaces.task.vo.TeacherTaskReqVO;
import com.tss.report.interfaces.task.vo.TeacherTaskRespVO;
import com.tss.report.services.task.po.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TaskDao {

    int insert(Task record);

    Task findById(Long id);

    int update(Task record);

    List<TeacherTaskRespVO> getTeacherTaskList(TeacherTaskReqVO param);

    List<Task> findByCourseIdAndTaskName(@Param("courseId") Long courseId, @Param("name") String name);

    List<StudentTaskRespVO> getStudentTaskList(StudentTaskReqVO param);
}