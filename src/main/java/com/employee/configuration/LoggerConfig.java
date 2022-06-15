package com.employee.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import comm.grpc.logger.service.LogGenerater;
import comm.grpc.logger.service.LogGeneraterImpl;
import comm.grpc.logger.service.LogMessageGenerater;
import comm.grpc.logger.service.LogMessageGeneraterImpl;

@Configuration
public class LoggerConfig {

	@Bean
	public LogGenerater logGenerater() {
	    return LogGeneraterImpl.builder().build();
	}
	
	@Bean
	public LogMessageGenerater logMessageGenerater() {
	    return LogMessageGeneraterImpl.builder().build();
	}
}
