package com.example.tutorjav202.buoi1.entity;

//CREATE TABLE lop_hoc (
//        id int PRIMARY KEY IDENTITY(1,1),
//        ten varchar(50),
//        so_tin_chi int
//        )
//        GO

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lop_hoc")
public class LopHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "so_tin_chi")
    private Integer soTinChi;
}
