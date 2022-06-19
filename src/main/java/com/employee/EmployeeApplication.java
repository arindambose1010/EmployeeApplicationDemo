package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import comm.grpc.logger.aspect.LoggingAspect;


@SpringBootApplication
@Configuration
@Import(value= {LoggingAspect.class})
@ComponentScan(basePackages = {"com.employee","comm.grpc.logger.*"})
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

}
