package com.order.service.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.order.model.Product;

@Service
public class ServiceClient {

	@Autowired
	DiscoveryClient discoveryClient;

	public Product getAllProducts(Long productId) {
		List<ServiceInstance> instances = discoveryClient.getInstances("Product-Service");
		System.out.println("Instances List :" + instances);

		String serviceBaseUrl = instances.get(0).getUri().toString();

		System.out.println("Service base url :" + serviceBaseUrl);

		String url = serviceBaseUrl + "/productid/" + productId;  // Correct URL

		System.out.println("Url :" + url);

		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(url, Product.class);

	}
}
