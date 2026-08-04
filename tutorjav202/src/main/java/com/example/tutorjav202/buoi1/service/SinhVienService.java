package com.example.tutorjav202.buoi1.service;

import com.example.tutorjav202.buoi1.entity.SinhVien;

import java.util.List;

public interface SinhVienService {
    public List<SinhVien> getAll();

    public SinhVien getById(Integer id);

    public void addSinhVien(SinhVien sinhVien);

    public void updateSinhVien(SinhVien sinhVien);

    public void deleteSinhVien(Integer id);
}
