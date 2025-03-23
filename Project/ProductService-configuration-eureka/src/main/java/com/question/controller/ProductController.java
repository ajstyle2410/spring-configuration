package com.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.question.model.Products;
import com.question.service.ProductInterface;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    public ProductInterface productInterface;

    @GetMapping("/viewproduct")
    public ResponseEntity<List<Products>> getProducts() {
        List<Products> list = productInterface.viewProducts();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{oid}")
    public ResponseEntity<Products> getAllProducts(@PathVariable Long oid) {
        Products prod = productInterface.viewIdwiseProducts(oid);
        if (prod != null) {
            return ResponseEntity.ok(prod);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/addproduct")
    public ResponseEntity<Products> addProduct(@RequestBody Products products) {
        Products p = productInterface.addProducts(products);
        return ResponseEntity.ok(p);
    }
}
