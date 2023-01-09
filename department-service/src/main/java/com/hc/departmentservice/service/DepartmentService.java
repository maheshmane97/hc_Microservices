package com.hc.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hc.departmentservice.entity.Department;
import com.hc.departmentservice.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	DepartmentRepository repository;
	
	public Department saveDept(Department department) {
		log.debug("Inside save Department Service");
		return repository.save(department);
	}
	
	public Department getByID(Integer dept_Id) {
		log.debug("Inside get Department Service");
		return repository.findById(dept_Id).get();
	}
}
