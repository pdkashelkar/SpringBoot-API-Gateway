package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.entity.UserDtls;

@Repository
public interface UserRepository extends JpaRepository<UserDtls, Long>{

	UserDtls findById(long userId);
	
}
