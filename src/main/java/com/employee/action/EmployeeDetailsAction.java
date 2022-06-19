package com.employee.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import comm.grpc.logger.annotaton.Log;
import comm.grpc.logger.service.LogMessageGenerater;

@RestController
public class EmployeeDetailsAction {

	@Autowired
	LogMessageGenerater log;
	
	@GetMapping("/{id}")
	@Log(name = "EmployeeApplication")
	public String emp(@PathVariable(value = "id") String id) {
		log.info("You are given id : "+id);
		return "Hello Arindam bose, you are no "+id;
	}
}
