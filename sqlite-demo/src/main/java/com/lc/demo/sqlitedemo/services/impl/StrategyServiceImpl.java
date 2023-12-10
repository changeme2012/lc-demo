package com.lc.demo.sqlitedemo.services.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lc.demo.sqlitedemo.entity.Strategy;
import com.lc.demo.sqlitedemo.mapper.StrategyMapper;
import com.lc.demo.sqlitedemo.services.StrategyService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:StrategyServiceImpl
 * Package:com.lc.demo.sqlitedemo.services.impl
 * Description:
 *
 * @Author: 龙成
 * @Create: 2023-12-09-19:31
 */
    @Service
    public class StrategyServiceImpl extends ServiceImpl<StrategyMapper, Strategy> implements StrategyService {

        @Override
        @Cacheable(value = "strategies", key = "#root.method.name")
        public List<Strategy> getStrategy() {
           return this.list();
        }
    }
