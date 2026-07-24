package com.example.sd22132jav202.buoi9.controller;

import com.example.sd22132jav202.buoi9.repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/buoi9")
public class Buoi9Controller {
    @Autowired
    SanPhamRepository sanPhamRepository;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("listSanPham", sanPhamRepository.findAll());
        return "/buoi9/hien-thi";
    }
}
