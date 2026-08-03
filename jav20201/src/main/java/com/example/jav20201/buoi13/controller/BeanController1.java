package com.example.jav20201.buoi13.controller;

import com.example.jav20201.buoi13.config.BeanDemo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buoi13")
public class BeanController1 {
    @Autowired
    BeanDemo beanDemo;

    @GetMapping("/get")
    public BeanDemo get() {
        return beanDemo;
    }

    @GetMapping("/edit")
    public BeanDemo edit() {
        beanDemo.setTuoi(20);
        return beanDemo;
    }
}
