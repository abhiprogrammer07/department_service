package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.Department;
import com.user.service.DepartmentService;

@RestController
@RequestMapping("/test")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	/*
	 * @GetMapping("/") public String test() {
	 * 
	 * return "Successfull message"; }
	 */
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		
		return departmentService.saveDepartment(department);
		
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
		
		return departmentService.findDepartmentById(departmentId);
		
	}
}
