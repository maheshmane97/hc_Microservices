package com.hc.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hc.userservice.entity.User;
import com.hc.userservice.repository.UserRepository;
import com.hc.userservice.valueObject.Department;
import com.hc.userservice.valueObject.RestTemplateVO;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	RestTemplate restTemplate;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public RestTemplateVO getUserWithDepartmentId(Integer user_Id) {
		RestTemplateVO vo = new RestTemplateVO();
		User user = userRepository.findByUserId(user_Id);

		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/dept?dept_Id=" + user.getDept_Id(),
				Department.class);

		vo.setUser(user);
		vo.setDepartment(department);

		return vo;
	}
}
