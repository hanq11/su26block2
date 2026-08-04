package com.example.tutorjav202.buoi1.request;

import com.example.tutorjav202.buoi1.entity.LopHoc;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SinhVienRequest {
    private Integer id;

    private String ten;

    private Integer tuoi;

    private String ngaySinh;

    private Boolean gioiTinh;

    private LopHoc lopHoc;
}
