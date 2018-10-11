package com.tom.mybatis01;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
//@MapperScan(value = "com.tom.mybatis01.mapper")
public class Mybatis01Application {
    public static void main(String[] args) {
        SpringApplication.run(Mybatis01Application.class, args);
    }
}
