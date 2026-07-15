package com.example.jav20201.buoi4.service;

import com.example.jav20201.buoi4.entity.SinhVien;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SinhVienService {
    List<SinhVien> listSinhVien = new ArrayList<>();

    public SinhVienService() {
        listSinhVien.add(new SinhVien(1, "Nguyen Van A", 7.4f, true));
        listSinhVien.add(new SinhVien(2, "Tran Van B", 8.4f, true));
        listSinhVien.add(new SinhVien(3, "Nguyen Thi C", 9.4f, false));
        listSinhVien.add(new SinhVien(4, "Cao Ba A", 5.4f, true));
    }

    public List<SinhVien> getAll() {
        return listSinhVien;
    }


    public void xoaSinhVien(Integer id) {
        listSinhVien.removeIf(sinhVien -> sinhVien.getId() == id);
    }
}
