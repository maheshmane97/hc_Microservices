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

@RestController
@RequestMapping("/dept")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping
    public Department saveDept(@RequestBody Department department) {
        return departmentService.saveDept(department);
    }

    @GetMapping
    public Department getById(@RequestParam("dept_Id") Integer dept_Id) {
        return departmentService.getByID(dept_Id);
    }
}
