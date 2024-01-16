package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {

    @RequestMapping("/helloWorld")
    public static String helloWorld(){
        return "hello world(updated)";
    }
}
