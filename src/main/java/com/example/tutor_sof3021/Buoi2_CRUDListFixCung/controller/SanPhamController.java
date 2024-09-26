package com.example.tutor_sof3021.Buoi2_CRUDListFixCung.controller;

import com.example.tutor_sof3021.Buoi2_CRUDListFixCung.entity.SanPham;
import com.example.tutor_sof3021.Buoi2_CRUDListFixCung.service.SanPhamService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
// @Service, @Repository, @RestController, @Compoment
// La 1 bean
public class SanPhamController {

    // C1: Goi 1 bean => @Autowired
    @Autowired
    private SanPhamService service;

    @GetMapping("/san-pham/view-all")
    public String hienThiDanhSachSanPham(Model model) {
        model.addAttribute("lists", service.getListSanPham());
        return "buoi2/san-pham";
    }

    @GetMapping("/san-pham/delete/{id}")
    public String removeSanPham(@PathVariable("id") Integer id1) {
        service.removeSanPham(id1);
        return "redirect:/san-pham/view-all";
    }

    @GetMapping("/san-pham/detail/{id1}")
    public String detailSanPham(@PathVariable Integer id1,
                                Model m) {
        m.addAttribute("sanPham", service.detailSanPham(id1));
        m.addAttribute("lists", service.getListSanPham());
        return "buoi2/san-pham";
    }

    @GetMapping("/san-pham/view-add")
    public String viewAdd(Model model) {
        // Khoi tao 1 doi tuong modelAttribute => de ben giao dien co doi tuong de hung cac thuoc tinh
        model.addAttribute("sp", new SanPham());
        return "buoi2/add-san-pham";
    }

    @PostMapping("/san-pham/add")
    public String addSanPham(@Valid @ModelAttribute("sp") SanPham sp, BindingResult result) {
        if (result.hasErrors()) {
            // co loi
            return "buoi2/add-san-pham";
        }
        service.addSanPham(sp);
        return "redirect:/san-pham/view-all";
    }

}
