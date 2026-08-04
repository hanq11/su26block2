package com.example.tutorjav202.buoi1.repository;

import com.example.tutorjav202.buoi1.entity.LopHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface LopHocRepository extends JpaRepository<LopHoc, Integer> {
}
