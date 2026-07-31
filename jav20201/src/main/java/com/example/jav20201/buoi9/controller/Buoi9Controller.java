package com.example.jav20201.buoi9.controller;

import com.example.jav20201.buoi9.entity.DanhMuc;
import com.example.jav20201.buoi9.entity.SanPham;
import com.example.jav20201.buoi9.repository.DanhMucRepository;
import com.example.jav20201.buoi9.repository.SanPhamRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

    // getById: sanPhamRepository.findById(id).get()
    // them, sua: sanPhamRepository.save()
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

    @GetMapping("/tim-kiem")
    public String timKiemTheoTen(@RequestParam("ten") String ten, Model model) {
        model.addAttribute("listSanPham", sanPhamRepository.findSanPhamsByTenContains(ten));
        model.addAttribute("listDanhMuc", danhMucRepository.findAll());
        return "/buoi9/hien-thi";
    }

    @GetMapping("/tim-kiem-sql")
    public String timKiemSql(@RequestParam("min") Float min, @RequestParam("max") Float max, Model model) {
        model.addAttribute("listSanPham", sanPhamRepository.timKiemTheoKhoangGiaSQL(min, max));
        model.addAttribute("listDanhMuc", danhMucRepository.findAll());
        return "/buoi9/hien-thi";
    }

    @GetMapping("/tim-kiem-jpql")
    public String timKiemJpql(@RequestParam("min") Float min, @RequestParam("max") Float max, Model model) {
        model.addAttribute("listSanPham", sanPhamRepository.timKiemTheoKhoangGiaJPQL(min, max));
        model.addAttribute("listDanhMuc", danhMucRepository.findAll());
        return "/buoi9/hien-thi";
    }

    @GetMapping("/phan-trang")
    public String phanTrang(
            @RequestParam(name = "page", defaultValue = "0") Integer page,
            Model model
    ) {
        int pageSize = 2;
        Pageable pageable = PageRequest.of(page, pageSize);
        model.addAttribute("listSanPham", sanPhamRepository.findAll(pageable));
        model.addAttribute("listDanhMuc", danhMucRepository.findAll());
        return "/buoi9/phan-trang";
    }
}
