package com.freeIapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.freeIapp.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
}
