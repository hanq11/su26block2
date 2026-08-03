package com.example.sd22132jav202.buoi9.controller;

import com.example.sd22132jav202.buoi9.entity.SanPham;
import com.example.sd22132jav202.buoi9.repository.DanhMucRepository;
import com.example.sd22132jav202.buoi9.repository.SanPhamRepository;
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

    @GetMapping("/tim-kiem")
    public String timKiem(@RequestParam("ten") String ten, Model model) {
        model.addAttribute("listSanPham", sanPhamRepository.findSanPhamsByTenContains(ten));
        model.addAttribute("listDanhMuc", danhMucRepository.findAll());
        return "/buoi9/hien-thi";
    }

    //http://localhost:8080/buoi9/tim-kiem-sql?min=4.3&max=4.5
    @ResponseBody
    @GetMapping("/tim-kiem-sql")
    public List<SanPham> timKiemSQL(@RequestParam("min") Float min, @RequestParam("max") Float max) {
        return sanPhamRepository.timKiemTheoGiaSQL(min, max);
    }

    @ResponseBody
    @GetMapping("/tim-kiem-jpql")
    public List<SanPham> timKiemJPQL(@RequestParam("min") Float min, @RequestParam("max") Float max) {
        return sanPhamRepository.timKiemTheoGiaSQL(min, max);
    }

    @GetMapping("/phan-trang")
    public String phanTrang(@RequestParam(name = "pageNumber", defaultValue = "0") Integer pageNumber
            , Model model) {
        int pageSize = 2;
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        model.addAttribute("listSanPham", sanPhamRepository.findAll(pageable));
        model.addAttribute("listDanhMuc", danhMucRepository.findAll());
        return "/buoi9/phan-trang";
    }
}
