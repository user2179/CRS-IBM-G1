package com.ibm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeImpl implements Employee{
	//public emp ="surya";
	List<String> empList = new ArrayList<>();
	@Override
	public List<String> ListEmployee(){
		return empList;
	}
	public void CreateEmployee(String emp) {
		empList.add(emp);
		//empList.add("surya");
	}
	
	
}
