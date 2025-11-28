package com.poly.main.B3_LamViecVoiForm.controller;

import com.poly.main.B3_LamViecVoiForm.request.LoginRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    // viet cac phuong thuc:
    // Get & Post: Get: Hien thi, Post: Xu ly form & Che giau thong tin de khong lo tren trinh duyet
    // TAT CA CAC HAM TRONG CONTROLLER => LUON LUON TRA VE STRING RETURN 1 VIEW
    // J4: Bat buoc phai theo / o dau

    @GetMapping("login")
    public String hienThiFormLogin() {
        // VIEW se nhan dinh tat ca nhung file HTML nam trong muc templates lam giao dien
        return "buoi3/form-login"; // RETURN ra 1 VIEW => /templates/buoi3/form-login.html
    }

    //    @PostMapping("ket-qua")
//    public String xuLyLogin(
//            @RequestParam("uname")String username, @RequestParam("pass")String pass,
//            Model m
//    ){
//        // lay gia tri cua o input: @RequestParam
//        m.addAttribute("a",username);
//        m.addAttribute("b",pass);
//        return "buoi3/xu-ly-form";
//    }
    @PostMapping("ket-qua")
    public String xuLyLogin(
           LoginRequest request,
            Model m
    ) {
        // xu ly validate => Spring Validation: @NotBlank, @NotEmpty..
        // lay gia tri cua o input: @RequestParam
        m.addAttribute("a", request.getUsername());
        m.addAttribute("b", request.getPassword());
        return "buoi3/xu-ly-form";
    }
}
