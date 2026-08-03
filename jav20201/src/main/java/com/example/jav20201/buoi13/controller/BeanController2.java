package com.example.jav20201.buoi13.controller;

import com.example.jav20201.buoi13.config.BeanDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buoi13")
public class BeanController2 {
    @Autowired
    BeanDemo beanDemo;

    @GetMapping("/get2")
    public BeanDemo get2() {
        return beanDemo;
    }
}
