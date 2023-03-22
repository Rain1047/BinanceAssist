package com.rain.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


@Service
public class PythonService {
    public int executeScript(int a, int b) {
        int result = 0;

        try {
            Process process = Runtime.getRuntime().exec("python3 src/main/resources/python/test.py " + a + " " + b);

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                result = Integer.parseInt(line);
            }

            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(result);
        return result;
    }
}
