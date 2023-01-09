package com.hc.departmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hc.departmentservice.entity.Department;
import com.hc.departmentservice.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/dept")
@Slf4j
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping
    public Department saveDept(@RequestBody Department department) {
    	log.debug("Inside save Department Controller");
        return departmentService.saveDept(department);
    }

    @GetMapping
    public Department getById(@RequestParam("dept_Id") Integer dept_Id) {
    	log.debug("Inside get Department Controller");
        return departmentService.getByID(dept_Id);
    }
}
