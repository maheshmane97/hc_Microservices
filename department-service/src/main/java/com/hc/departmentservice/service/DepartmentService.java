package com.hc.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hc.departmentservice.entity.Department;
import com.hc.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository repository;
	
	public Department saveDept(Department department) {
		return repository.save(department);
	}
	
	public Department getByID(Integer dept_Id) {
		return repository.findById(dept_Id).get();
	}
}
