package com.example.tutor_sof3021.Buoi2_CRUDListFixCung.service;

import com.example.tutor_sof3021.Buoi2_CRUDListFixCung.entity.SanPham;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SanPhamService {

    private List<SanPham>listSanPham = new ArrayList<>();

    public SanPhamService() {
        // khoi tao cac gia tri cho list
        listSanPham.add(new SanPham(1,"Sp01","San pham 1",10,"Loai 1"));
        listSanPham.add(new SanPham(2,"Sp02","San pham 2",2,"Loai 2"));
        listSanPham.add(new SanPham(3,"Sp03","San pham 3",55,"Loai 3"));
        listSanPham.add(new SanPham(4,"Sp04","San pham 4",20,"Loai 4"));
        listSanPham.add(new SanPham(5,"Sp05","San pham 5",23,"Loai 1"));
    }

    public List<SanPham> getListSanPham() {
        return listSanPham;
    }
}
