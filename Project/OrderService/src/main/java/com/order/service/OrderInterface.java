package com.order.service;

import java.util.List;

import com.order.model.Orders;
import com.order.model.Product;


public interface OrderInterface {

	List<Orders> viewProducts();

	Orders addProducts(Orders products);
	
	public Product getAllProducts(Long id);

}
