package com.poly.main.B4_CRUDListFixCung.controller;

import com.poly.main.B4_CRUDListFixCung.entity.SinhVien;
import com.poly.main.B4_CRUDListFixCung.service.SinhVienService;
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
public class SinhVienController {
    // trong controller => service

    // Khoi tao doi tuong
    @Autowired
    private SinhVienService svService;


    @GetMapping("sinh-vien/hien-thi")
    public String hienThiDanhSachSinhVien(Model m) {
        m.addAttribute("list", svService.getListSinhVien());
        return "buoi4/sinh-viens";
    }

    // neu gia tri nao tren duong dan co su thay doi => {tenBien}
    @GetMapping("sinh-vien/remove/{id1}")
    public String xoaSinhVien(@PathVariable("id1") String id) {
        svService.removeSinhVien(id);
        // quay ve trang ban dau: "sinh-vien/hien-thi"
        // Co 2 cach:
        // C1: redirect
        // C2: Goi lai list => Serivce: svService.getListSinhVien() roi return html
        return "redirect:/sinh-vien/hien-thi";
    }

    // Bam vao button Add => Chuyen sang giao dien trang add moi
    @GetMapping("sinh-vien/view-add")
    public String hienThiThongTinTrangAdd(Model m) {
        // Day la phuong thuc can tao doi tuong => day sang HTML de validate
        m.addAttribute("sv2", new SinhVien());
        return "buoi4/add-sinh-vien";
    }

    // Ham xu ly khi add sinh vien
    @PostMapping("sinh-vien/add")
    public String addSinhVien(@Valid @ModelAttribute("sv2") SinhVien sv, BindingResult result) {
        // Khi k validate (Truyen ca 1 doi tuong thay vi Request Param => Ten cua thuoc tinh(entity)
        // phai trung vs ten cua name trong input
        // validate
        if (result.hasErrors()) {
            return "buoi4/add-sinh-vien";
        }
        svService.add(sv);
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("sinh-vien/detail/{id1}")
    public String detailSinhVien(@PathVariable("id1") String mssv, Model m) {
        m.addAttribute("sv3", svService.detailSinhVien(mssv));
        return "buoi4/update-sinh-vien";
    }
}
