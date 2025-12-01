package com.poly.main.B4_CRUDListFixCung.controller;

import com.poly.main.B4_CRUDListFixCung.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SinhVienController {
    // trong controller => service

    // Khoi tao doi tuong
    @Autowired
    private SinhVienService svService;


    @GetMapping("sinh-vien/hien-thi")
    public String hienThiDanhSachSinhVien(Model m){
        m.addAttribute("list",svService.getListSinhVien());
        return "buoi4/sinh-viens";
    }

    // neu gia tri nao tren duong dan co su thay doi => {tenBien}
    @GetMapping("sinh-vien/remove/{id1}")
    public String xoaSinhVien(@PathVariable("id1") String id){
        svService.removeSinhVien(id);
        // quay ve trang ban dau: "sinh-vien/hien-thi"
        // Co 2 cach:
        // C1: redirect
        // C2: Goi lai list => Serivce: svService.getListSinhVien() roi return html
        return "redirect:/sinh-vien/hien-thi";
    }
}
