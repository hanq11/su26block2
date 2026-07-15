package com.example.jav20201.buoi4.controller;

import com.example.jav20201.buoi4.service.SinhVienService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SinhVienController {

    @Autowired
    SinhVienService sinhVienService;
//    @Autowired
//    HttpServletRequest request;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("listSinhVien", sinhVienService.getAll());
        return "/buoi4/hien-thi";
    }


    @GetMapping("/xoa")
    public String xoa(Model model, @RequestParam("id") Integer id) {
//        Integer id = Integer.parseInt(request.getParameter("id"));
        sinhVienService.xoaSinhVien(id);
        return "redirect:/hien-thi";
    }
}
