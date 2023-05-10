package com.ons.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ons.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUsername (String username);

}
