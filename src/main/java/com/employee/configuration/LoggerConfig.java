package com.employee.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import comm.grpc.logger.service.LogGenerater;

@Configuration
public class LoggerConfig {

	@Bean
	public LogGenerater logGenerater() {
	    return new LogGenerater();
	}
}
