package com.example.tutor_sof3021.Buoi4_JPA.controller;

import com.example.tutor_sof3021.Buoi4_JPA.repository.LopHocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class LopHocController {

    @Autowired
    private LopHocRepository lopHocRepository;

    // hien thi tat ca => findAll
    // add / update => save
    // delete => delete(Object)
    // deleteById( khoa chinh)
    @GetMapping("/lop-hoc/hien-thi")
    public String hienThiLopHoc(Model model) {
        model.addAttribute("listLopHoc", lopHocRepository.findAll());
//        lopHocRepository.findById(id).get()
        return "/buoi4/lop-hoc";
    }
    @GetMapping("/lop-hoc/detail/{id}")
    public String detail(@PathVariable("id") Long id,Model model){
        model.addAttribute("lopHoc",lopHocRepository.findById(id).get());
        return "/buoi4/detail-lop-hoc";
    }
    @GetMapping("/lop-hoc/detele/{id}")
    public String delete(@PathVariable("id") Long id){
        lopHocRepository.deleteById(id);
        return "redirect:/lop-hoc/hien-thi";
    }

}
