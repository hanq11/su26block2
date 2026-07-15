package com.example.sd22132jav202.buoi4.controller;

import com.example.sd22132jav202.buoi4.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/buoi4")
public class SinhVienController {
    @Autowired
    SinhVienService sinhVienService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("listSinhVien", sinhVienService.getAll());
        return "/buoi4/hien-thi";
    }
}
