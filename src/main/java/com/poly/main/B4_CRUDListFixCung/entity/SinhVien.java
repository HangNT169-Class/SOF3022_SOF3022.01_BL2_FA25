package com.poly.main.B4_CRUDListFixCung.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

    // message loi default dung cua Spring
    @NotBlank
    private String mssv;

    @NotBlank(message = "Ten khong duoc trong")
    private String ten;

    @NotBlank(message = "Dia chi khong duoc trong")
    private String diaChi;

    @NotNull(message = "Tuoi khong duoc trong")
    // nen doi kieu du lieu thanh kieu Object
    private Integer tuoi;

    private boolean gioiTinh;

}
