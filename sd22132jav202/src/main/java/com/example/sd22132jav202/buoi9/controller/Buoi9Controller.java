package com.example.sd22132jav202.buoi9.controller;

import com.example.sd22132jav202.buoi9.entity.DanhMuc;
import com.example.sd22132jav202.buoi9.entity.SanPham;
import com.example.sd22132jav202.buoi9.repository.DanhMucRepository;
import com.example.sd22132jav202.buoi9.repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/buoi9")
public class Buoi9Controller {
    @Autowired
    SanPhamRepository sanPhamRepository;

    @Autowired
    DanhMucRepository danhMucRepository;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("listSanPham", sanPhamRepository.findAll());
        model.addAttribute("listDanhMuc", danhMucRepository.findAll());

        return "/buoi9/hien-thi";
    }

    // chon danhMuc bang combobox: danhMucRepository.findAll()
    // them, sua: sanPhamRepository.save(sanPham)
    // view update: sanPhamRepository.findById(id).get()
    // xoa: sanPhamRepository.deleteById(id)

    @PostMapping("/them")
    public String them(SanPham sanPham) {
        sanPhamRepository.save(sanPham);
        return "redirect:/buoi9/hien-thi";
    }
//
//    @ModelAttribute("listDanhMuc")
//    public List<DanhMuc> getListDanhMuc() {
//        return danhMucRepository.findAll();
//    }

    @GetMapping("/view-update/{id}")
    public String viewUpdate(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("sp", sanPhamRepository.findById(id).get());
        model.addAttribute("listDanhMuc", danhMucRepository.findAll());
        return "/buoi9/view-update";
    }

    @PostMapping("/sua")
    public String sua(SanPham sanPham) {
        sanPhamRepository.save(sanPham);
        return "redirect:/buoi9/hien-thi";
    }

    @GetMapping("/xoa")
    public String xoa(@RequestParam("id") Integer id) {
        sanPhamRepository.deleteById(id);
        return "redirect:/buoi9/hien-thi";
    }
}
