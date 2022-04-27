package com.ibm.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ibm.service.Employee;
import com.ibm.service.EmployeeImpl;

@Configuration
public class EmployeeConfig {

	@Bean(name="EmployeeBean")
	public Employee emlpoyee() {
		return new EmployeeImpl();
	}
}
