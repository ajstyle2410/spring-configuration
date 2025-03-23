package com.order.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.model.Orders;
import com.order.model.Product;
import com.order.repository.OrderRepository;
import com.order.service.OrderInterface;
import com.order.service.client.ServiceClient;

@Service
public class OrderServiceImpl implements OrderInterface {

	@Autowired
	OrderRepository product;
	
	@Autowired
	ServiceClient client;

	@Override
	public List<Orders> viewProducts() {
		return product.findAll();
	}

	@Override
	public Orders addProducts(Orders order) {
		return product.save(order);
	}

	@Override
	public Product getAllProducts(Long id) {
		return client.getAllProducts(id);
	}

}
