package com.example.jav20101.buoi1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Buoi1Controller {
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "/buoi1/hello-world";
    }
}
