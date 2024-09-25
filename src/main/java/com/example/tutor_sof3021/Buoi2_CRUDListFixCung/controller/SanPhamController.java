package com.example.tutor_sof3021.Buoi2_CRUDListFixCung.controller;

import com.example.tutor_sof3021.Buoi2_CRUDListFixCung.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SanPhamController {

    // C1: Goi 1 bean => @Autowired
    @Autowired
    private SanPhamService service;

    @GetMapping("/san-pham/view-all")
    public String hienThiDanhSachSanPham(Model model){
        model.addAttribute("lists",service.getListSanPham());
        return "buoi2/san-pham";
    }
}
