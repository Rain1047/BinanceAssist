package com.rain.controller;

import com.alibaba.fastjson.JSONObject;
import com.binance.connector.client.exceptions.BinanceClientException;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.SpotClientImpl;

import com.rain.config.PrivateConfig;
import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSON;

@RestController
@RequestMapping("/account")
public final class AccountController {
    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
    @Resource
    private SpotClientImpl spotClient;

    @GetMapping("{userId}")
    public Map<String, Object> getAccount(@PathVariable Integer userId) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();

        String result = "";
        try {
            result = spotClient.createTrade().account(parameters);
//            logger.info(result);

        } catch (BinanceConnectorException e) {
            logger.error("fullErrMessage: {}", e.getMessage(), e);
        } catch (BinanceClientException e) {
            logger.error("fullErrMessage: {} \nerrMessage: {} \nerrCode: {} \nHTTPStatusCode: {}",
                    e.getMessage(), e.getErrMsg(), e.getErrorCode(), e.getHttpStatusCode(), e);
        }

        JSONObject jResult = JSON.parseObject(result);
        return jResult;

    }
}