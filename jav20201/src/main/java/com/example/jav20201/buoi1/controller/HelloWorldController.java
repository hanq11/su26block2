package com.example.jav20201.buoi1.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    @Autowired
    HttpServletRequest request;

    @GetMapping("/hello-world")
//    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    public String helloWorld(Model model) {
        model.addAttribute("ten", request.getParameter("ten"));
        model.addAttribute("truong", "fpoly");
        return "buoi1/hello-world";
    }
}
