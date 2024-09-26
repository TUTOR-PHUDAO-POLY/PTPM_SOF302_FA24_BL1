package com.example.tutor_sof3021.Buoi2_CRUDListFixCung.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SanPham {

    @NotNull
    private Integer id;

    @NotBlank(message = "Ma khong duoc de trong")
    private String ma;

    @NotBlank(message = "Ten k dc de trong")
//    @Pattern(regexp = "vut doan regex vao day")
    private String ten;

    @NotNull
    @Min(value = 1)
    private Integer gia;

    private String loai;
    // T7: JPA 1 bang
    // T3: JPA join bang luyen tap
    // T5: on tap tong hop

}
