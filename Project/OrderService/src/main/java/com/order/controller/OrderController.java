package com.order.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.model.Orders;
import com.order.model.Product;
import com.order.service.OrderInterface;


@RestController
public class OrderController {

	@Autowired
	public OrderInterface orderInterface;

	
	
	@GetMapping("orderdetails/{oid}")
	public ResponseEntity<Product> productIdWiseOrders(@PathVariable("oid") Long oid) {
	    Product product = orderInterface.getAllProducts(oid);
	    return ResponseEntity.ok(product);
	}

	
	@GetMapping("viewproduct/{oid}")
	public ResponseEntity<List<Orders>> getProducts() {
		List<Orders> list = orderInterface.viewProducts();

		return ResponseEntity.ok(list);
	}

	@PostMapping("addproduct")
	public ResponseEntity<Orders> addProduct(@RequestBody Orders products) {
		Orders p = orderInterface.addProducts(products);

		return ResponseEntity.ok(p);
	}

}
