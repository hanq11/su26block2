package com.example.sd22132jav202.buoi13.controller;

import com.example.sd22132jav202.buoi13.bean.BeanTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buoi13")
public class BeanDemo2Controller {
    @Autowired
    BeanTest beanTest;

    @GetMapping("/get2")
    public BeanTest get() {
        return beanTest;
    }
}
