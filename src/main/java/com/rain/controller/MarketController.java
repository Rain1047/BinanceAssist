package com.rain.controller;

import com.binance.connector.client.impl.SpotClientImpl;
import com.rain.config.MarketConfig;
import com.rain.config.PrivateConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;


@RestController
@RequestMapping("/market")
public class MarketController {

    @Resource
    private SpotClientImpl spotClient;
    private static final Logger logger = LoggerFactory.getLogger(MarketController.class);

    @GetMapping("/{crypto}")
    public String getByTicker(@PathVariable String crypto){


//        SpotClientImpl spotClient = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY); //old version
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
}
