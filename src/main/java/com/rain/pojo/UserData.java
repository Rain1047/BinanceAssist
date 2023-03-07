package com.rain.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class UserData {
    private Integer id;
    private String name;
    private String email;

    // getter and setter methods

}
