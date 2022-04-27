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

//This is an app config class which is a module configuration of the various spring pojo classes using
//by @configuration annotation
@Configuration
//@import({EmpoloyeeConfig.class})
public class AppConfig {
	@Bean(name="helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
}
