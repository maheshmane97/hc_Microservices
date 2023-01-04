package com.hc.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hc.userservice.entity.User;
import com.hc.userservice.service.UserService;
import com.hc.userservice.valueObject.RestTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping
	public User saveUser(@RequestBody User user) {
		log.debug("Inside save user controller");
		return userService.saveUser(user);
	}
	
	@GetMapping
	public RestTemplateVO getUserById(@RequestParam Integer userId) {
		return userService.getUserWithDepartmentId(userId);
	}

}
