package com.lc.demo.sqlitedemo.mapper;

import com.lc.demo.sqlitedemo.entity.StudentCourseDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName:StudentCourseMapper
 * Package:com.lc.demo.sqlitedemo.mapper
 * Description:
 *
 * @Author: 龙成
 * @Create: 2023-12-10-12:42
 */
@Mapper
public interface StudentCourseMapper {

    List<StudentCourseDTO> getStudentCourseDetails(@Param("studentId") Long studentId);

}
