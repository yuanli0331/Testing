package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestingController {

    @RequestMapping("/helloWord")
    public static String helloWord(){
        return "hello world !";
    }
}
