package com.lc.demo.sqlitedemo.services;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.demo.sqlitedemo.entity.Strategy;

import java.util.List;

/**
 * ClassName:StrategyService
 * Package:com.lc.demo.sqlitedemo.services
 * Description:
 *
 * @Author: 龙成
 * @Create: 2023-12-09-19:30
 */
public interface StrategyService extends IService<Strategy> {

    List<Strategy> getStrategy ();
}
