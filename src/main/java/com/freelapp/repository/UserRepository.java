package com.freelapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freelapp.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
}
