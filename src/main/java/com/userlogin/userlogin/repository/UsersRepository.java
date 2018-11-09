package com.userlogin.userlogin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userlogin.userlogin.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>

{


	Optional<Users> findByName(String username);
	

}
