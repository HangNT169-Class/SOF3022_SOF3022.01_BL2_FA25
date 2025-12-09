//package com.poly.main.B9_JPA.entity;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
//@Entity
//@Table(name = "product")
//public class Product1 {
//    // MAPPING HET CAC TRUONG TRU KHOA NGOA
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private Long id;
//
//    @Column(name = "product_code")
//    private String productCode;
//
//    @Column(name = "product_name")
//    private String projectName;
//
//    @Column
//    private Float price;
//
//    @Column
//    private String description;
//
//    // Khoa ngoai
//    @ManyToOne
//    @JoinColumn(name = "category_id", referencedColumnName = "id")
//    private Category1 cate;
//
//}
