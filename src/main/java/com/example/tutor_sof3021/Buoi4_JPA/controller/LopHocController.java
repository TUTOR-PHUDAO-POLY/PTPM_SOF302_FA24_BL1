package com.example.tutor_sof3021.Buoi4_JPA.controller;

import com.example.tutor_sof3021.Buoi4_JPA.entity.LopHoc;
import com.example.tutor_sof3021.Buoi4_JPA.repository.LopHocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
        model.addAttribute("listLopHoc",
                lopHocRepository.findAll());
//        lopHocRepository.findById(id).get()
        return "/buoi4/lop-hoc";
    }

    @GetMapping("/lop-hoc/detail/{id}")
    public String detail(@PathVariable("id") Long id,
                         Model model) {
        model.addAttribute("lopHoc",
                lopHocRepository.findById(id).get());
        return "/buoi4/detail-lop-hoc";
    }

    @GetMapping("/lop-hoc/detele/{id}")
    public String delete(@PathVariable("id") Long id) {
        lopHocRepository.deleteById(id);
        return "redirect:/lop-hoc/hien-thi";
    }

    @ResponseBody
    // Restfull
    // Su dung full: GET,Post,Put, Delete, Patch
    @GetMapping("hien-thi")
    public List<LopHoc> hienThi() {
        return lopHocRepository.findAll();
    }

    // ajax
    // limit, offset
    // Phan trang => Page (String Boot)
    @ResponseBody
    @GetMapping("phan-trang")
    // DS: 10 phan tu tu : 3 phan tu/trang
    // Trang 1: 3 phan tu <=> trang dau = 0
    // Trang 2: 3 phan tu tiep
    // Trang 3: 3 phan tu tiep
    // Trang 4: 1 phan tu
    public List<LopHoc> phanTrangLopHoc(@RequestParam("size1") Integer size,
                                        @RequestParam("pageNo1") Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo, size);
        return lopHocRepository.findAll(pageable).getContent();
    }

}
