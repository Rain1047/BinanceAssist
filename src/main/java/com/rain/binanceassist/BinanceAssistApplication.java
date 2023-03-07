package com.rain.binanceassist;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.rain.controller","com.rain.config","com.rain.service","com.rain.dao"})
@MapperScan("com.rain.dao")
@SpringBootApplication
public class BinanceAssistApplication {

    public static void main(String[] args) {
        SpringApplication.run(BinanceAssistApplication.class, args);
        System.out.println("server start");
    }

}
