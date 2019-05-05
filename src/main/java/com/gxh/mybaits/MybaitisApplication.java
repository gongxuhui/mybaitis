package com.gxh.mybaits;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.gxh.mybatis.dao")
public class MybaitisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybaitisApplication.class, args);
    }

}

