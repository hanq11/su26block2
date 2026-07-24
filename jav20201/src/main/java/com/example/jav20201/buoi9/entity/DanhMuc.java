package com.example.jav20201.buoi9.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//
//    id INT IDENTITY(1,1) PRIMARY KEY,
//            ten NVARCHAR(100) NOT NULL,
//            cap_do INT NOT NULL,
//            he_so FLOAT NOT NULL
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "danh_muc")
public class DanhMuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "cap_do")
    private Integer capDo;

    @Column(name = "he_so")
    private Integer heSo;
}

