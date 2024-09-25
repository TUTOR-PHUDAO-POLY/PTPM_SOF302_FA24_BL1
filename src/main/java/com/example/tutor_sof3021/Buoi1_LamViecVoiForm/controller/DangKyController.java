package com.example.tutor_sof3021.Buoi1_LamViecVoiForm.controller;

import com.example.tutor_sof3021.Buoi1_LamViecVoiForm.request.DangKyRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
// @Repository, @Service , @Component..
public class DangKyController {

    @GetMapping
    public String dangky(Model model) {
        // Khoi tao 1 doi tuong cho ben view
        model.addAttribute("dangKyRequest", new DangKyRequest());
        return "dang-ky";
    }

    @PostMapping("/home")
    public String hienThiDuLieuDangKY(
            @Valid @ModelAttribute("dangKyRequest") DangKyRequest request,
            BindingResult result, Model model
            // Doi lai vi tri: Model o vi tri cuoi cung
    ) {
        // validate :
        // - check trong
        // C1: validate bt
//        if (request.getMssv().isBlank() || request.getTen().isEmpty() || request.getDiaChi().isEmpty()) {
//            model.addAttribute("error", "Khong duoc de trong");
//            return "dang-ky";
//        }
        if (result.hasErrors()) {
            return "dang-ky";
        }
        // J4: getParameter
        // J5: RequestParae("ma",request.getMssv());
        model.addAttribute("mssv", request.getMssv());
        model.addAttribute("ten", request.getTen());
        model.addAttribute("gioiTinh", request.getGioiTinh());
        model.addAttribute("diaChi", request.getDiaChi());
        return "home";
    }

}
