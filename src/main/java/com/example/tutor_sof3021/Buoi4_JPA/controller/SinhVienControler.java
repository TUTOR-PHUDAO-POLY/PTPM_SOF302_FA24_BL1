package com.example.tutor_sof3021.Buoi4_JPA.controller;

import com.example.tutor_sof3021.Buoi4_JPA.entity.LopHoc;
import com.example.tutor_sof3021.Buoi4_JPA.entity.SinhVien;
import com.example.tutor_sof3021.Buoi4_JPA.repository.LopHocRepository;
import com.example.tutor_sof3021.Buoi4_JPA.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SinhVienControler {
    @Autowired
    private SinhVienRepository sinhVienRepository;

    @Autowired
    private LopHocRepository lopHocRepository;

    @GetMapping("/sinh-vien/hien-thi")
    public String hienThiSV(Model model) {
        model.addAttribute("listSV", sinhVienRepository.findAll());
        model.addAttribute("listLopHoc", lopHocRepository.findAll()); // load du lieu len cbb
        return "/buoi4/sinhvien";
    }

    @GetMapping("sinh-vien/remove/{id}")
    public String removeSinhVien(@PathVariable("id") Long id) {
        sinhVienRepository.deleteById(id);
        return "redirect:/sinh-vien/hien-thi";
    }

    @PostMapping("/sinh-vien/add")
    public String addSinhVien(@RequestParam("mssv") String mssv,
                              @RequestParam("ten") String ten,
                              @RequestParam("diaChi") String diaChi,
                              @RequestParam("lopHoc") String lopHocId
    ) {
        LopHoc lop = lopHocRepository.findById(Long.valueOf(lopHocId)).get();
        SinhVien sv = SinhVien.builder()
                .name(ten)
                .diaChi(diaChi)
                .mssv(mssv)
                .lopHoc(lop)
                .build();
        sinhVienRepository.save(sv);
        return "redirect:/sinh-vien/hien-thi";
    }
}
