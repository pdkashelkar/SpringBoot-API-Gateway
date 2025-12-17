package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.UserDtls;
import com.user.model.Product;
import com.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public ResponseEntity<List<UserDtls>> findAllUsers(){
		return ResponseEntity.ok(userService.fetchAllUsers());
	}
	
	@PostMapping("/user")
	public ResponseEntity<UserDtls> createUser(@RequestBody UserDtls newUser){
		return ResponseEntity.ok(userService.createUser(newUser));
	}
	
	@PostMapping("/users")
	public ResponseEntity<List<UserDtls>> createUser(@RequestBody List<UserDtls> newUsers){
		return ResponseEntity.ok(userService.createUsers(newUsers));
	}
	
	@GetMapping("/users/products/{userId}")
	public ResponseEntity<List<Product>> getAllProductsByUserId(@PathVariable("userId") long userId){
		return ResponseEntity.ok(userService.getAllProductsByUserId(userId));
	}
}
