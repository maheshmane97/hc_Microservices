package com.hc.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hc.departmentservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
