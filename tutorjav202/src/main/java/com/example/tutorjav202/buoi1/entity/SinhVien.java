package com.example.tutorjav202.buoi1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//CREATE TABLE sinh_vien(
//        id int PRIMARY KEY IDENTITY(1,1),
//        ten varchar(50),
//        tuoi int,
//        ngay_sinh date,
//        gioi_tinh bit,
//        id_lop_hoc int,
//        FOREIGN KEY(id_lop_hoc) REFERENCES lop_hoc(id)
//        )
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sinh_vien")
public class SinhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "tuoi")
    private Integer tuoi;

    @Column(name = "ngay_sinh")
    private String ngaySinh;

    @Column(name = "gioi_tinh")
    private Boolean gioiTinh;

    @ManyToOne
    @JoinColumn(name = "id_lop_hoc", referencedColumnName = "id")
    private LopHoc lopHoc;
}
