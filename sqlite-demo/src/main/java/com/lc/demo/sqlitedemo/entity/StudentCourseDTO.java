package com.lc.demo.sqlitedemo.entity;

import lombok.Data;

/**
 * ClassName:StudentCourseDTO
 * Package:com.lc.demo.sqlitedemo.entity
 * Description:
 *
 * @Author: 龙成
 * @Create: 2023-12-10-12:37
 */
@Data
public class StudentCourseDTO {
    private Long studentId;
    private String studentName;
    private Double score;
    private String courseName;
}
