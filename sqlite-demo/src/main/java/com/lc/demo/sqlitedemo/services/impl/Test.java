package com.lc.demo.sqlitedemo.services.impl;

import com.lc.demo.sqlitedemo.entity.Strategy;
import com.lc.demo.sqlitedemo.services.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:Test
 * Package:com.lc.demo.sqlitedemo.services.impl
 * Description:
 *
 * @Author: 龙成
 * @Create: 2023-12-09-21:32
 */
@Service
public class Test {
    @Autowired
    StrategyService strategyService;

    int count = 1;

//    @Scheduled(fixedDelay = 5000)
    public void getAll( )  {
            List<Strategy> list = strategyService.getStrategy();
            System.out.println("第" +count+ "次" + "测试查询全表:" + list);
            count ++;
    }

}
