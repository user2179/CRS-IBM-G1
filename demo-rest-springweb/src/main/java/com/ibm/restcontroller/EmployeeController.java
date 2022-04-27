package com.ibm.restcontroller;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.bean.Employee;

@RestController
public class EmployeeController {

	@RequestMapping("/hello-world")
	public String helloWorld() {
		
		
		return "Hello! Is it World you are looking for?";
	}
	

			
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
		    method = RequestMethod.GET,
		    value = "/details")
		@ResponseBody
	 public Employee details(){
		
		Employee employee=new Employee();
		employee.setId (0);
		employee.setName("Surya");
		employee.setAddress("Ongole");
		return employee;
	}

}
