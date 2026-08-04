package com.example.tutorjav202.buoi1.service.impl;

import com.example.tutorjav202.buoi1.entity.LopHoc;
import com.example.tutorjav202.buoi1.entity.SinhVien;
import com.example.tutorjav202.buoi1.repository.SinhVienRepository;
import com.example.tutorjav202.buoi1.request.SinhVienRequest;
import com.example.tutorjav202.buoi1.response.SinhVienResponse;
import com.example.tutorjav202.buoi1.service.SinhVienService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinhVienServiceImpl implements SinhVienService {
    @Autowired
    SinhVienRepository sinhVienRepository;
    @Override
    public List<SinhVienResponse> getAll() {
        return sinhVienRepository
                .findAll()
                .stream()
                .map(SinhVienResponse::new)
                .toList();
    }
    @Override
    public SinhVienResponse getById(Integer id) {
        SinhVien sinhVien = sinhVienRepository.findById(id).get();
        return new SinhVienResponse(sinhVien);
    }
    @Override
    public void addSinhVien(SinhVienRequest sinhVienRequest) {
        SinhVien sinhVien = new SinhVien();
        BeanUtils.copyProperties(sinhVienRequest, sinhVien);
        sinhVienRepository.save(sinhVien);
    }
    @Override
    public void updateSinhVien(SinhVienRequest sinhVienRequest) {
        SinhVien sinhVien = new SinhVien();
        BeanUtils.copyProperties(sinhVienRequest, sinhVien);
        sinhVienRepository.save(sinhVien);
    }
    @Override
    public void deleteSinhVien(Integer id) {
        sinhVienRepository.deleteById(id);
    }

    @Override
    public Page phanTrang(Integer pageNumber, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return sinhVienRepository.findAll(pageable);
    }
}
