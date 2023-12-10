package com.lc.demo.sqlitedemo.controller;

import com.lc.demo.sqlitedemo.entity.Strategy;
import com.lc.demo.sqlitedemo.services.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName:StrategyUpdate
 * Package:com.lc.demo.sqlitedemo.controller
 * Description:
 *
 * @Author: 龙成
 * @Create: 2023-12-09-19:15
 */

@RestController
public class StrategyUpdate {

    @Autowired
    StrategyService strategyService;

    @PostMapping("/update")
    @CacheEvict(value = "strategies", allEntries = true)
    public void updateStrategy( Strategy strategy) {
        boolean success = strategyService.updateById(strategy);
        if (success) {
            System.out.println("更新成功");
        } else {
            System.out.println("更新失败");
        }
    }

    @GetMapping("/getAll")
    public List<Strategy> getStrategy( ) {
        //查Strategy全表
        List<Strategy> list = strategyService.list();
        System.out.println("查询全表:" + list);
        return list;
    }
}
