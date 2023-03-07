package com.rain.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FormController {

    @PostMapping("/submitForm")
    public ResponseEntity<String> submitForm(@RequestParam("name") String name, @RequestParam("email") String email) {
        // 处理表单数据
        // ...
        System.out.println("name: " + name);
        System.out.println("email: " + email);
        return ResponseEntity.ok("Success");
    }



}
