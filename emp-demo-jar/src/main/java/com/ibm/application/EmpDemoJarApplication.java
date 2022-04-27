package com.ibm.application;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.ibm.configuration.AppConfig;
//import com.ibm.configuration.EmployeeConfig;
import com.ibm.service.Customer;
import com.ibm.service.Employee;
import com.ibm.service.HelloWorld;

@SpringBootApplication
@ComponentScan({"com.ibm.*"})   //scans stereotype annotation and create reference instance in string container
@Import({AppConfig.class})
@EnableAutoConfiguration
public class EmpDemoJarApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpDemoJarApplication.class, args);
		ApplicationContext context=SpringApplication.run(AppConfig.class);

		Employee obj = (Employee) context.getBean("employeeBean");
		HelloWorld obj1 = (HelloWorld) context.getBean("helloBean");
		Customer obj2 = (Customer) context.getBean("customerBean");
		
		obj.createEmployee();
		obj.listEmployee();
		obj1.printHelloWorld("Will to Spring from 5th floor is up and running");
		obj2.createCustomer();
		obj2.listCustomer();
		obj2.deleteCustomer();
		obj2.listCustomer();
		obj2.updateCustomer();
		obj2.listCustomer();
	}

}
