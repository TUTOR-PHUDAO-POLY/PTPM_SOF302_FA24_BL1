package com.example.tutor_sof3021.Buoi4_JPA.controller;

import com.example.tutor_sof3021.Buoi4_JPA.entity.LopHoc;
import com.example.tutor_sof3021.Buoi4_JPA.repository.LopHocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Lop1Controller {

    @Autowired
    private LopHocRepository lopHocRepository;

    @GetMapping("test")
    public List<LopHoc> hienThi() {
        return lopHocRepository.findAll();
    }
}
