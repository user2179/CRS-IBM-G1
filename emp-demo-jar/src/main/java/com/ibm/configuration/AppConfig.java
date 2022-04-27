/**

 * 
 */
package com.ibm.configuration;
//import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//import com.ibm.service.HelloWorld;
//import com.ibm.service.HelloWorldImpl;
//import com.ibm.service.Employee;
//import com.ibm.service.EmployeeImpl;
//import com.ibm.service.Customer;
//import com.ibm.service.CustomerImpl;

/**
 * @author 003CS5744
 *
 */

//This is an app config class which is a module configuration of the various spring pojo classes using
//by @configuration annotation
@Configuration
@Import({EmployeeConfig.class,HelloWorldConfig.class,CustomerConfig.class})
public class AppConfig {

}
