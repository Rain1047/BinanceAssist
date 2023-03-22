package com.rain.service;

import com.alibaba.fastjson.JSON;
import com.rain.dao.UserDataMapper;
import com.rain.pojo.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDataService {
    @Autowired
    private UserDataMapper userDataMapper;

    public void saveJsonData(String jsonDataStr) {
        // 将JSON字符串转换成JsonData对象
        UserData userData = JSON.parseObject(jsonDataStr, UserData.class);

        // 存入数据库中
        userDataMapper.insert(userData);

    }
}

