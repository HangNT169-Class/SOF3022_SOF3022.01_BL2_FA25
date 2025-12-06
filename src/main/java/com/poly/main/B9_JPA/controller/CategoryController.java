package com.poly.main.B9_JPA.controller;

import com.poly.main.B9_JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository repo;


    @GetMapping("category/hien-thi")
    public String hienThiDanhSach(Model m) {
        m.addAttribute("lists", repo.findAll());
        return "buoi9/index";
    }
}
