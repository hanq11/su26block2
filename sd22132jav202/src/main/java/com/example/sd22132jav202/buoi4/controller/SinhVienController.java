package com.example.sd22132jav202.buoi4.controller;

import com.example.sd22132jav202.buoi4.entity.SinhVien;
import com.example.sd22132jav202.buoi4.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/them")
    public String themSinhVien(SinhVien sinhVien) {
        sinhVienService.themSinhVien(sinhVien);
        return "redirect:/buoi4/hien-thi";
    }

    @GetMapping("/view-update/{id}")
    public String viewUpdate(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("sinhVien", sinhVienService.getById(id));
        return "/buoi4/view-update";
    }

    @PostMapping("/sua")
    public String suaSinhVien(SinhVien sinhVien) {
        sinhVienService.suaSinhVien(sinhVien);
        return "redirect:/buoi4/hien-thi";
    }

    @GetMapping("/xoa")
    public String xoaSinhVien(@RequestParam("id") Integer id) {
        sinhVienService.xoaSinhVien(id);
        return "redirect:/buoi4/hien-thi";
    }
}
