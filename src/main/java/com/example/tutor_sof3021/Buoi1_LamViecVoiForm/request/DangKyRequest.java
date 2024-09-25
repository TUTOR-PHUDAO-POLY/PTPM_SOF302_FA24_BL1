package com.example.tutor_sof3021.Buoi1_LamViecVoiForm.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DangKyRequest {

    @NotBlank(message = "MSSV k duoc trong")
    @Size(min = 5)
    private String mssv;

    // @Min
    // @Max
    @NotBlank
//    @Pattern(regexp = "[a-z A-Z]+")
    private String ten;

    private Boolean gioiTinh;

//    @NotBlank
    private String diaChi;

}
