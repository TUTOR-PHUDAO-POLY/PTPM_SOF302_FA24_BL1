package com.example.tutor_sof3021.Buoi4_JPA.repository;

import com.example.tutor_sof3021.Buoi4_JPA.entity.LopHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LopHocRepository extends JpaRepository<LopHoc, Long> {
    // trao doi truc tiep vs CSDL
    // co 2 cach :
    // 1. extends CRUDRepository
    // 2. extends JPARepository
    // JPA => phien ban sau
    // JPA => 2 tham so:
    // TS1: Doi tuong ma cac ban muon lam viec
    // TS2: Kieu du lieu cua khoa chinh  => CHI NHAN KIEU OBJECT KHONG NHAN KIEU NGUYEN THUY
    // CRUD 1 bang => KHONG CAN PHAI VIET (TU DONG CO SAN)
    // custom sql
    //1.Raw SQL
//    List<LopHoc>findLopHocsByName1OrDiaDiemLopHoc(String name, String diaDiemLopHoc);
    // 2. JPQL <=> HQL => Truy van tren thuc the
    @Query("SELECT l FROM LopHoc l WHERE l.name1 LIKE ?1 AND l.diaDiemLopHoc LIKE ?2")
    List<LopHoc> searchTen(String name, String diaDiemLopHoc);
    // 3. native query => Truy van dua vao cau lenh SQL (*)

}
