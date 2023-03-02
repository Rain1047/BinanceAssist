package com.rain.config;

import com.binance.connector.client.impl.SpotClientImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.rain.controller")
public class MarketConfig {
    @Bean
    public SpotClientImpl spotClient(){
        SpotClientImpl spotClient = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        return spotClient;
    }



}

