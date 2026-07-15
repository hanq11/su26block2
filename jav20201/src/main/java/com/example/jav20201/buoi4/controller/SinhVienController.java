package com.example.jav20201.buoi4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinhVienController {

    @GetMapping("/sinh-vien/hien-thi")
    public String sinhVien() {
        return "sinh-vien";
    }
}
