package com.question.service;

import java.util.List;

import com.question.model.Products;

public interface ProductInterface {

	List<Products> viewProducts();

	Products addProducts(Products products);

	Products viewIdwiseProducts(long id);

}
