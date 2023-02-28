package com.rain.binanceassistant2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.rain.controller"})
@SpringBootApplication
public class BinanceAssistant2Application {

    public static void main(String[] args) {
        SpringApplication.run(BinanceAssistant2Application.class, args);
    }

}
