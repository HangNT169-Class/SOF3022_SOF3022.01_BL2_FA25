package com.poly.main.B4_CRUDListFixCung.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SinhVien {
//    Tạo đối tượng SinhVien gồm các thuộc tính:
//    mssv - String, ten-String, tuoi- int,
//    diaChi - String, gioiTinh - boolean
//    và các constructor, getter, setter

    private String mssv;

    private String ten;

    private String diaChi;

    private int tuoi;

    private boolean gioiTinh;

}
