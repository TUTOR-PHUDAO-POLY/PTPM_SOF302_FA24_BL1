package com.example.tutor_sof3021.Buoi2_CRUDListFixCung.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SanPham {
//    Tạo class SanPham gồm các thuộc tính id-int, ma-String,
//    ten-String, loai-String, gia-int
//    và các phương thức contructor, getter, setter

    private Integer id;

    private String ma;

    private String ten;

    private Integer gia;

    private String loai;

}
