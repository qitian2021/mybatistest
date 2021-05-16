package com.test.lu.mybatistest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot启动类
 * @author Lenovo
 */
@SpringBootApplication
@MapperScan("com.test.lu.mybatistest.mapper")
//@MapperScan("com.test.lu.mybatistest")
public class MybatistestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatistestApplication.class, args);
    }

}
