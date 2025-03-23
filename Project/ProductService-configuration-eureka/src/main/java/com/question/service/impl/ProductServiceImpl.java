package com.question.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.model.Products;
import com.question.repository.ProductRepository;
import com.question.service.ProductInterface;

@Service
public class ProductServiceImpl implements ProductInterface {

	@Autowired
	ProductRepository product;

	@Override
	public List<Products> viewProducts() {
		return product.findAll();
	}

	@Override
	public Products addProducts(Products products) {
		return product.save(products);
	}

	@Override
	public Products viewIdwiseProducts(long id) {
		return product.findById(id).get();
	}

}
