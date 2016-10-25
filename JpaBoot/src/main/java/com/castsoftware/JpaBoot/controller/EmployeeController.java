package com.castsoftware.JpaBoot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.castsoftware.JpaBoot.model.Employee;
import com.castsoftware.JpaBoot.service.EmployeeService;

@RestController
@RequestMapping(value="api/employee/")
public class EmployeeController {

	@RequestMapping(value="getemployee")
	public List<Employee> getEmployee(){
		List<Employee> empList=EmployeeService.getEmployeeList();
		return empList;
	}
	
}
