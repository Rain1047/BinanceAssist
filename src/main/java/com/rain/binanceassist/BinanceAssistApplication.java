package com.rain.binanceassist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.rain.controller","com.rain.config"})
@SpringBootApplication
public class BinanceAssistApplication {

    public static void main(String[] args) {
        SpringApplication.run(BinanceAssistApplication.class, args);
        System.out.println("server start");
    }

}
