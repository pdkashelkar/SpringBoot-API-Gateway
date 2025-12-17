package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/products")
	private ResponseEntity<List<Product>> fetchProducts() {
		return ResponseEntity.ok(productService.fetchProducts());
	}

	@PostMapping("/product")
	private ResponseEntity<Product> createProduct(@RequestBody Product newProduct) {
		return ResponseEntity.ok(productService.createProduct(newProduct));
	}

	@PostMapping("/products")
	private ResponseEntity<List<Product>> createProducts(@RequestBody List<Product> newProducts) {
		return ResponseEntity.ok(productService.createProducts(newProducts));
	}
	
	@GetMapping("/products/users/{userId}")
	private ResponseEntity<List<Product>> fetchProductsByUserId(@PathVariable long userId) {
		return ResponseEntity.ok(productService.fetchProductsByUserId(userId));
	}

}
