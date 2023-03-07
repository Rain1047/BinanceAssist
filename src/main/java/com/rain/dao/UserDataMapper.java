package com.rain.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rain.pojo.UserData;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDataMapper extends BaseMapper<UserData> {
}

