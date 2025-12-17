package com.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> fetchProducts(){
		return productRepository.findAll();
	}
	
	public Product createProduct(Product newProduct) {
		return productRepository.save(newProduct);
	}
	
	public List<Product> createProducts(List<Product> newProducts) {
		List<Product> updProduct = new ArrayList<>();
		return productRepository.saveAll(newProducts);
	}
	
	public List<Product> fetchProductsByUserId(long userId){
		return productRepository.findProductsByUserId(userId);
	}
	
	
}
