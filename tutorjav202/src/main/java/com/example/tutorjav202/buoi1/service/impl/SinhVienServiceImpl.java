package com.example.tutorjav202.buoi1.service.impl;

import com.example.tutorjav202.buoi1.entity.SinhVien;
import com.example.tutorjav202.buoi1.repository.SinhVienRepository;
import com.example.tutorjav202.buoi1.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinhVienServiceImpl implements SinhVienService {
    @Autowired
    SinhVienRepository sinhVienRepository;
    @Override
    public List<SinhVien> getAll() {
        return sinhVienRepository.findAll();
    }
    @Override
    public SinhVien getById(Integer id) {
        return sinhVienRepository.findById(id).get();
    }
    @Override
    public void addSinhVien(SinhVien sinhVien) {
        sinhVienRepository.save(sinhVien);
    }
    @Override
    public void updateSinhVien(SinhVien sinhVien) {
        sinhVienRepository.save(sinhVien);
    }
    @Override
    public void deleteSinhVien(Integer id) {
        sinhVienRepository.deleteById(id);
    }
}
