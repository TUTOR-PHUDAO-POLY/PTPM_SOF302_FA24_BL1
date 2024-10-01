package com.example.tutor_sof3021.Buoi4_JPA.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "sinh_vien")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class SinhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "mssv")
    private String mssv;
    @Column(name = "dia_chi")
    private String diaChi;

    // Khoa ngoai
    // default => Eager
    @ManyToOne
    @JoinColumn(name = "lop_hoc_id", referencedColumnName = "id")
    private LopHoc lopHoc;

}
