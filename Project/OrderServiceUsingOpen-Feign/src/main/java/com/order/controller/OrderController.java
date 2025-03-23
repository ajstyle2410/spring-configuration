package com.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.order.model.Orders;
import com.order.model.Product;
import com.order.service.OrderInterface;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    public OrderInterface orderInterface;

    @GetMapping("/orderdetails/{oid}")
    public ResponseEntity<Product> getProductById(@PathVariable Long oid) {
        System.out.println("Order id is " + oid);
        Product product = orderInterface.getAllProducts(oid);
        if (product == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(product);
    }

    @GetMapping("/viewproduct")
    public ResponseEntity<List<Orders>> getProducts() {
        List<Orders> list = orderInterface.viewProducts();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/addproduct")
    public ResponseEntity<Orders> addProduct(@RequestBody Orders products) {
        Orders p = orderInterface.addProducts(products);
        return ResponseEntity.ok(p);
    }
}
