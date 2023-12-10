package com.lc.demo.sqlitedemo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * ClassName:Strategy
 * Package:com.lc.demo.sqlitedemo.entity
 * Description:
 *
 * @Author: 龙成
 * @Create: 2023-12-09-19:13
 */
@Data
@TableName(value = "strategy")
public class Strategy implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId
    private Integer id;
    private String strategyName;
}
