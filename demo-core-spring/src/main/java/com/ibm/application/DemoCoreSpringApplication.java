package com.ibm.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
//This annotation identifying the entry point of your spring application project 

import com.ibm.configuration.AppConfig;
import com.ibm.configuration.EmployeeConfig;
import com.ibm.service.HelloWorld;
import com.ibm.service.Employee;
//import com.ibm.service.EmployeeImpl;
@SpringBootApplication
@ComponentScan({"com.ibm.*"})  //This annotations will scan all the stereotype annotation and create the reference instance in a spring container
@Import({AppConfig.class,EmployeeConfig.class})
@EnableAutoConfiguration
public class DemoCoreSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoCoreSpringApplication.class, args);
		//System.out.println("This is my first spring application");
		ApplicationContext context=SpringApplication.run(AppConfig.class);
		
	    HelloWorld obj = (HelloWorld) context.getBean("helloBean");
	    
	    obj.printHelloWorld("Spring 5 service working");
	   // emp.add("surya");
	   // empList.add("surya");
	}

}
