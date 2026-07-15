package com.example.sd22132jav202.buoi4.service;

import com.example.sd22132jav202.buoi4.entity.SinhVien;
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

    public SinhVien getById(Integer id) {
        for (SinhVien sinhVien: listSinhVien) {
            if(sinhVien.getId() == id) {
                return sinhVien;
            }
        }
        return null;
    }

    public void themSinhVien(SinhVien sinhVien) {
        listSinhVien.add(sinhVien);
    }

    public void suaSinhVien(SinhVien sinhVien) {
        // Cach 1
//        int indexCanSua = -1;
//        for(int i = 0; i < listSinhVien.size(); i++ ) {
//            if(listSinhVien.get(i).getId() == sinhVien.getId()) {
//                indexCanSua = i;
//            }
//        }
//        listSinhVien.set(indexCanSua, sinhVien);
//
        // Cach 2
        for(SinhVien sv: listSinhVien) {
            if(sv.getId() == sinhVien.getId()) {
                sv.setTen(sinhVien.getTen());
                sv.setDiem(sinhVien.getDiem());
                sv.setGioiTinh(sinhVien.getGioiTinh());
            }
        }
    }

    public void xoaSinhVien(Integer id) {
        listSinhVien.removeIf(sinhVien -> sinhVien.getId() == id);
    }
}
