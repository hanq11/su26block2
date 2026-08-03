package com.example.sd22132jav202.buoi13.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDemo {
    @Bean
    public BeanTest beanConfig() {
        return new BeanTest("Nguyen Van A", 15);
    }
}
