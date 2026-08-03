package com.example.sd22132jav202.buoi9.repository;

import com.example.sd22132jav202.buoi9.entity.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Integer> {
    // query method
    public List<SanPham> findSanPhamsByTenContains(String ten);

    // native query - sql
    @Query(value = "SELECT * FROM san_pham WHERE gia BETWEEN :min AND :max", nativeQuery = true)
    public List<SanPham> timKiemTheoGiaSQL(Float min, Float max);

    // JPQL - jarkata persistent query language
    @Query(value = "SELECT sp FROM SanPham sp WHERE sp.gia BETWEEN :min AND :max")
    public List<SanPham> timKiemTheoGiaJPQL(Float min, Float max);
}
