/**
 * 
 */
package com.ibm.service;
import java.util.ArrayList;

import java.util.List;
import com.ibm.bean.EmployeeBean;

import org.springframework.stereotype.Component;

/**
 * @author 003B6I744
 *
 */
@Component
public class EmployeeImpl implements Employee{
	
	List<EmployeeBean> employee=new ArrayList<EmployeeBean>();

	@Override
	public void createEmployee() {
		// TODO Auto-generated method stub
		// logic of code
		EmployeeBean bean=new EmployeeBean();
		bean.setEmployeeId(101);
		bean.setEmployeeName("vidhi");
		bean.setAddress("kolkata");
		bean.setLocation("India");
		
		
		EmployeeBean bean1=new EmployeeBean();
		bean1.setEmployeeId(102);
		bean1.setEmployeeName("surya");
		bean1.setAddress("ongole");
		bean1.setLocation("Ukraine");
		System.out.println("create employee method"); // aqdd some record in EMployee Obj. 
		
		EmployeeBean bean2=new EmployeeBean();
		bean2.setEmployeeId(1);
		bean2.setEmployeeName("Pravalli");
		bean2.setAddress("AutoNagar");
		bean2.setLocation("AutoNationisthan");
	     employee.add(bean);    // employee object which contains the details of properties/ values
	     employee.add(bean1);
	     employee.add(bean2);
	     
	}

	@SuppressWarnings("unchecked")
	@Override
	public void listEmployee() {
		// TODO Auto-generated method stub
		
		// logic of code to list the Employee
		System.out.println("list employee method");
		System.out.println(employee);
		
	  // employee.forEach(System.out::println);
		
		for(EmployeeBean emp : employee) {
			
		  System.out.println("details of employee here-->" +emp.getEmployeeId() +"--" +emp.getEmployeeName() + "--" +emp.getLocation());	
	
		}
	}

}


