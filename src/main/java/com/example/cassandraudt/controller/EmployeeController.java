package com.example.cassandraudt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.cassandraudt.model.Employee;
import com.example.cassandraudt.repository.IEmployeeRepository;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
@RequestMapping("/getEmployee")
public class EmployeeController {
	
	@Autowired
	IEmployeeRepository employeeRepository;

	@GetMapping()
	@ApiOperation(value = "Get employee list")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved employees list") })
	public ResponseEntity<List<Employee>> getEmployees() {
		return new ResponseEntity<>(employeeRepository.findAll(), HttpStatus.OK);
	}
	
}
