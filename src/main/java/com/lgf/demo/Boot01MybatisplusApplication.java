package com.lgf.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lgf.demo.mapper")
@SpringBootApplication
public class Boot01MybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot01MybatisplusApplication.class, args);
    }

}
