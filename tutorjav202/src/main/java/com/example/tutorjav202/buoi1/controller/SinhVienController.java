package com.example.tutorjav202.buoi1.controller;

import com.example.tutorjav202.buoi1.entity.SinhVien;
import com.example.tutorjav202.buoi1.request.SinhVienRequest;
import com.example.tutorjav202.buoi1.response.SinhVienResponse;
import com.example.tutorjav202.buoi1.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buoi1")
public class SinhVienController {
    @Autowired
    SinhVienService sinhVienService;

    @GetMapping("/hien-thi")
    public List<SinhVienResponse> hienThi() {
        return sinhVienService.getAll();
    }

    @GetMapping("/{id}")
    public SinhVienResponse detail(@PathVariable("id") Integer id) {
        return sinhVienService.getById(id);
    }

    @PostMapping("/them")
    public void them(@RequestBody SinhVienRequest sinhVienRequest) {
        sinhVienService.addSinhVien(sinhVienRequest);
    }

    @PutMapping("/sua")
    public void sua(@RequestBody SinhVienRequest sinhVienRequest) {
        sinhVienService.addSinhVien(sinhVienRequest);
    }

    @DeleteMapping("/xoa")
    public void xoa(@RequestParam("id") Integer id) {
        sinhVienService.deleteSinhVien(id);
    }

    @GetMapping("/phan-trang")
    public Page phanTrang(@RequestParam("pageNumber") Integer pageNumber,
                          @RequestParam("pageSize") Integer pageSize) {
        return sinhVienService.phanTrang(pageNumber, pageSize);
    }
}
