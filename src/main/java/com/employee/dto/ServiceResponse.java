package com.employee.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ServiceResponse implements Serializable{
	private static final long serialVersionUID = 1L;
	private int code;
	private String message;
	
	
}
