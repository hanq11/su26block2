package com.example.jav20201.buoi9.repository;

import com.example.jav20201.buoi9.entity.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Integer> {
    // query method
    public List<SanPham> findSanPhamsByTenContains(String ten);

    // raw query - sql
    @Query(value = "SELECT * FROM san_pham WHERE gia BETWEEN :min and :max", nativeQuery = true)
    public List<SanPham> timKiemTheoKhoangGiaSQL(@Param("min") Float min, @Param("max") Float max);

    // jpql
    @Query(value = "SELECT sp FROM SanPham sp WHERE sp.gia BETWEEN :min and :max")
    public List<SanPham> timKiemTheoKhoangGiaJPQL(@Param("min") Float min, @Param("max") Float max);
}
