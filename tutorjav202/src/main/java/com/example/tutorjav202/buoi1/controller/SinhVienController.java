package com.example.tutorjav202.buoi1.controller;

import com.example.tutorjav202.buoi1.entity.SinhVien;
import com.example.tutorjav202.buoi1.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buoi1")
public class SinhVienController {
    @Autowired
    SinhVienService sinhVienService;

    @GetMapping("/hien-thi")
    public List<SinhVien> hienThi() {
        return sinhVienService.getAll();
    }

    @GetMapping("/{id}")
    public SinhVien detail(@PathVariable("id") Integer id) {
        return sinhVienService.getById(id);
    }

    @PostMapping("/them")
    public void them(SinhVien sinhVien) {
        sinhVienService.addSinhVien(sinhVien);
    }

    @PutMapping("/sua")
    public void sua(SinhVien sinhVien) {
        sinhVienService.addSinhVien(sinhVien);
    }

    @DeleteMapping("/xoa")
    public void xoa(@RequestParam("id") Integer id) {
        sinhVienService.deleteSinhVien(id);
    }
}
