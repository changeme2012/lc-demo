package com.lc.demo.sqlitedemo.entity;

import lombok.Data;

/**
 * ClassName:Student
 * Package:com.lc.demo.sqlitedemo.entity
 * Description:
 *
 * @Author: 龙成
 * @Create: 2023-12-10-12:36
 */
@Data
public class Student {
    private Long id;
    private String name;
    private Long courseId;
    private Double score;
}
