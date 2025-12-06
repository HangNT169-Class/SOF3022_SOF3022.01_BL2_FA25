package com.poly.main.B9_JPA.repository;

import com.poly.main.B9_JPA.entity.Category1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category1,Long> {
    // CRUD 1 bang k can viet JPA se co san cac ham
    // Get all => findAll()
    // getOne(id) => findById(khoa chinh)
    // add hoac update => save(Object)
    // remove => deleteById(khoa chinh)
    // JPQL <=> HQL
    // JPQL => K CO SELECT * FROM TABLE
    @Query("SELECT cate FROM Category1 cate WHERE cate.categoryName1 = ?1")
    List<Category1>timKiemTheoTen(String name);

    @Query("SELECT cate FROM Category1 cate ORDER BY cate.categoryCode")
    List<Category1>sapXepTangDanTheoMa();

}
