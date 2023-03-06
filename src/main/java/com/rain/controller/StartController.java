package com.rain.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
public class StartController {

    @RequestMapping("/")
    public String Test() {
        return "hello";
    }

    // 不带参数，一般获取参数所有数据
    @GetMapping("/get")
    public String testGet() {
        return "我是 GET 请求";
    }

    // 携带请求参数，携带参数获取数据
    @GetMapping("/get/params")
    public String test (@RequestParam("name") String name) {
        return "名称" + name;
    }

    // RestAPI，获取请求路径中的数据。 一般用来请求单条数据
    @GetMapping("/get/{id}")
    public String testGet1(@PathVariable("id") Integer id) {
        return "id:" + id;
    }

    // 接收实体参数，只要与实体的属性一一对应，就可以接收。 以实体类的形式接受参数
    @GetMapping("/get/model")
    public Map<String,Object> testGet2(@ModelAttribute User user) {
        Map<String,Object> map = new HashMap<>();
        map.put("user",user);
        map.put("code",200);
        map.put("msg","请求成功~");
        return map;
    }

    // 接受 JSON格式的实体类
    @GetMapping("/get/json/data")
    public Map<String,Object> testGet3(@RequestBody User user) {
        Map<String,Object> map = new HashMap<>();
        map.put("user",user);
        map.put("code",200);
        map.put("msg","请求成功~");
        return map;
    }

}