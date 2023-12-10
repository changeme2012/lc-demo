package com.lc.demo.sqlitedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableCaching
@SpringBootApplication
public class SqliteDemoApplication {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext run = SpringApplication.run(SqliteDemoApplication.class, args);

    }

}
