package com.hc.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hc.userservice.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUserId(Integer userId);

}
