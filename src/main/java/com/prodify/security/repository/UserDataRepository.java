package com.prodify.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodify.security.model.User;

@Repository
public interface UserDataRepository extends JpaRepository<User,Integer>{

	public Optional<User> findByUserName(String user_name);
}
