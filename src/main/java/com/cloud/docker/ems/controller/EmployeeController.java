package com.cloud.docker.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.docker.ems.model.Employee;
import com.cloud.docker.ems.services.EmployeeServices;

@RestController
public class EmployeeController {

	@Autowired
    private EmployeeServices employeeServices;
	
	@GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeServices.getAllEmployees();
    }
	
	@PostMapping("/addemp")
    public List<Employee> addEmployee(@RequestBody Employee employee) {
        return employeeServices.addEmployee(employee);
    }
	
	@DeleteMapping("/deleteemp/{id}")
    public List<Employee> deleteEmployee(@PathVariable Long id) {
        return employeeServices.deleteEmployee(id);
    }
	
	@GetMapping("/fetchemp/{id}")
    public Employee fetchEmployee(@PathVariable Long id) {
        return employeeServices.fetchEmployee(id);
    }
}
