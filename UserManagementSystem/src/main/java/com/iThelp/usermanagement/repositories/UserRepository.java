package com.iThelp.usermanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iThelp.usermanagement.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
	User findByEmailAndUserPwd(String email, String pwd);
	
}