package com.rain.config;

import com.binance.connector.client.impl.SpotClientImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.rain")
public class MarketConfig {

    @Bean
    public SpotClientImpl spotClient(){
        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        return client;
    }


}
