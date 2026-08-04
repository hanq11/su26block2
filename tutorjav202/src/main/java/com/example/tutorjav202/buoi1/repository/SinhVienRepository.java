package com.example.tutorjav202.buoi1.repository;

import com.example.tutorjav202.buoi1.entity.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinhVienRepository extends JpaRepository<SinhVien, Integer> {
}
