package com.example.tutorjav202.buoi1.service;

import com.example.tutorjav202.buoi1.entity.SinhVien;
import com.example.tutorjav202.buoi1.request.SinhVienRequest;
import com.example.tutorjav202.buoi1.response.SinhVienResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface SinhVienService {
    public List<SinhVienResponse> getAll();

    public SinhVienResponse getById(Integer id);

    public void addSinhVien(SinhVienRequest sinhVienRequest);

    public void updateSinhVien(SinhVienRequest sinhVienRequest);

    public void deleteSinhVien(Integer id);

    public Page phanTrang(Integer pageNumber, Integer pageSize);
}
