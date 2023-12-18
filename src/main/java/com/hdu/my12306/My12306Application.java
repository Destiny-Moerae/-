package com.hdu.my12306;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@MapperScan(basePackages = "com.hdu.my12306.mapper")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})

public class My12306Application {

    public static void main(String[] args) {
        SpringApplication.run(My12306Application.class, args);
    }

}
