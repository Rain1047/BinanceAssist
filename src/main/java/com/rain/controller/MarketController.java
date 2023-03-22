package com.rain.controller;

import com.binance.connector.client.impl.SpotClientImpl;
import com.rain.config.MarketConfig;
import com.rain.config.PrivateConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/market")
public class MarketController {
    private static final Logger logger = LoggerFactory.getLogger(MarketController.class);
    SpotClientImpl spotClient = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY); //old version
    @GetMapping("/{crypto}")
    public String getByTicker(@PathVariable String crypto){
//        SpotClientImpl spotClient = ctx.getBean(SpotClientImpl.class);
        System.out.println(spotClient);
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol", crypto);
        parameters.put("interval", "1d");
        System.out.println(parameters);
        String result = spotClient.createMarket().klines(parameters);
        logger.info(result);
        return "get: " + crypto;
    }

    @PostMapping("/{crypto}")
    public String postByTicker(@RequestParam("crypto") String crypto) {
        // 处理表单数据
        // ...
        System.out.println("crypto: " + crypto);
        System.out.println(spotClient);
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol", crypto);
        parameters.put("interval", "1d");
        System.out.println(parameters);
        String result = spotClient.createMarket().klines(parameters);
        logger.info(result);
//        return "get crypto: " + crypto;
        return result;
    }
}
