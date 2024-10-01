package com.example.tutor_sof3021.Buoi4_JPA.repository;

import com.example.tutor_sof3021.Buoi4_JPA.entity.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinhVienRepository extends JpaRepository<SinhVien,Long> {
}
