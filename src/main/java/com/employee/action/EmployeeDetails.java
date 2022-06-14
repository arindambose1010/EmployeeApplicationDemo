package com.employee.action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import comm.grpc.logger.annotaton.Log;

@RestController
public class EmployeeDetails {

	@GetMapping("/{id}")
	@Log(name = "EmployeeApplication")
	public String emp(@PathVariable(value = "id") Integer id) {
		return "Hello Arindam bose, you are no "+id;
	}
}
