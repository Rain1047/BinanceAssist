package com.rain.controller;

import com.rain.service.PythonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.apache.coyote.http11.Constants.a;

@RestController
@RequestMapping("/python")
public class PythonController {
    @Autowired
    private PythonService pythonService;

    @GetMapping("/script")
    public String executeScript() {
        System.out.println("use python service");
        try{
            int a = 3;
            int b = 4;
            pythonService.executeScript(a, b);

        }
        catch (Exception E){
            System.out.println("error while using service");
        };
        return "pythonService finished";
    }
}
