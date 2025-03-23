package com.order.service.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.order.model.Product;

@FeignClient(name = "Product-Service")
public interface ServiceClient {

    @GetMapping("/product/{oid}")
    public Product getAllProducts(@PathVariable("oid") Long oid);
}
