package com.example.jav20201.buoi13.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public BeanDemo khoiTao() {
        return new BeanDemo("Nguyen Van A", 15);
    }
}
