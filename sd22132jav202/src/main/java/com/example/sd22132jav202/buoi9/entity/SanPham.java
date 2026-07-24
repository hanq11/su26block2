package com.example.sd22132jav202.buoi9.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//    id INT IDENTITY(1,1) PRIMARY KEY,
//            ten NVARCHAR(100) NOT NULL,
//            gia FLOAT,
//            con_bao_hanh BIT, -- 1: con bao hanh, 0: het bao hanh
//            id_danh_muc INT,
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "san_pham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "gia")
    private Float gia;

    @Column(name = "con_bao_hanh")
    private Boolean conBaoHanh;

    @ManyToOne
    @JoinColumn(name = "id_danh_muc", referencedColumnName = "id")
    private DanhMuc danhMuc;
}
