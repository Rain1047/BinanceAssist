package com.rain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class JsonController {

    @GetMapping("/getData")
    public Map<String, Object> getData() {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "John");
        data.put("age", 30);
        return data;
    }

    @GetMapping("/redirect")
    public String redirect() {
        return "redirect:/getData";
    }

}
