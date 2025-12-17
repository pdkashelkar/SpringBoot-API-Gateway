package com.user.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.user.model.Product;

@FeignClient(name="product-service")
public interface ProductServiceFeignClient {

	@GetMapping("/products/products/users/{userId}")
	List<Product> getProductsByUserId(@PathVariable("userId") long userId);
}
