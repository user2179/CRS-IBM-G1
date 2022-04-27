package com.ibm.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan({"com.ibm.*"})
@Configuration
@EnableAutoConfiguration
@EnableWebMvc    //enable web based capabilities for REST implementation in Spring
public class DemoRestSpringwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestSpringwebApplication.class, args);
	}

}
