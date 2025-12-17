package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.UserDtls;
import com.user.model.Product;
import com.user.repository.UserRepository;

@Service
public class UserService {

	private final ProductServiceFeignClient productServiceFeignClient;
	
	@Autowired
	public UserService(ProductServiceFeignClient productServiceFeignClient) {
		this.productServiceFeignClient = productServiceFeignClient;
	}
	
	
	@Autowired
	private UserRepository userRepository;
	
	public List<UserDtls> fetchAllUsers() {
		return userRepository.findAll();
	}
	
	public UserDtls createUser(UserDtls newUser) {
		return userRepository.save(newUser);
	}
	
	public List<UserDtls> createUsers(List<UserDtls> newUsers) {
		return userRepository.saveAll(newUsers);
	}
	
	public UserDtls getUserById(long userId) {
		return userRepository.findById(userId);
	}
	
	public List<Product> getAllProductsByUserId(long userId) {
		return productServiceFeignClient.getProductsByUserId(userId);
	}
}
