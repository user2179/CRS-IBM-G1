/**
 * 
 */
package com.ibm.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ibm.service.HelloWorld;
import com.ibm.service.HelloWorldImpl;

/**
 * @author 003CS5744
 *
 */
@Configuration
public class HelloWorldConfig {
	@Bean(name="helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }

}
