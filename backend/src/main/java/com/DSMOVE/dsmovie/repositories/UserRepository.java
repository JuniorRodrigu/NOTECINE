package com.DSMOVE.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DSMOVE.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);


}
