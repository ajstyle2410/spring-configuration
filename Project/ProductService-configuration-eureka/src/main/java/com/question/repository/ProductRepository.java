package com.question.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.question.model.Products;

public interface ProductRepository extends JpaRepository<Products, Long> {

}
