package com.rain.controller;

import com.rain.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@RestController
//@RequestMapping("/user")
//public class UserDataController {
//    @GetMapping("/{id}")
//    public String getById(@PathVariable Integer id){
//        System.out.println("id--->" + id);
//        return "hello, Stringboot";
//    }
//
//
//}

@RestController
@RequestMapping("/userData")
public class UserDataController {
    @Autowired
    private UserDataService userDataService;

    @PostMapping("/json")
    public ResponseEntity<String> saveJsonData(@RequestBody String jsonDataStr) {
        System.out.println(jsonDataStr);
        userDataService.saveJsonData(jsonDataStr);
        return ResponseEntity.ok("Save");
    }
}
