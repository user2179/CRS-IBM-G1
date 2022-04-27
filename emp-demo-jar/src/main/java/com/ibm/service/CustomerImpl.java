/**
 * 
 */
package com.ibm.service;

import java.util.ArrayList;

import java.util.List;

import com.ibm.bean.CustomerBean;
//import com.ibm.bean.EmployeeBean;
import com.ibm.bean.EmployeeBean;

/**
 * @author 003CS5744
 *
 */
public class CustomerImpl implements Customer {

	List<CustomerBean> customer=new ArrayList<CustomerBean>();


	@Override
	public void createCustomer() {
		// TODO Auto-generated method stub
		System.out.println("this is create customer method");
		CustomerBean bean=new CustomerBean();
		bean.setCustomerid(1);
		bean.setCustomerdob("15/08/1947");
		bean.setCustomername("Pravalli");
		bean.setCustomeraddress("AutoNagar");
		bean.setCustomerpincode("514142");
		CustomerBean bean1=new CustomerBean();
		bean1.setCustomerid(2);
		bean1.setCustomerdob("26/09/2008");
		bean1.setCustomername("kasab");
		bean1.setCustomeraddress("TajMahal Hotel");
		bean1.setCustomerpincode("786786");
		
		customer.add(bean);
		customer.add(bean1);
		
	}

	@Override
	public void updateCustomer() {
		// TODO Auto-generated method stub
		System.out.println("this is update customer method");
		CustomerBean bean2=new CustomerBean();
		bean2.setCustomerid(2);
		bean2.setCustomerdob("26/09/2008");
		bean2.setCustomername("kasab");
		bean2.setCustomeraddress("Pakisthan");
		bean2.setCustomerpincode("911911");
		customer.add(bean2);
		//customer.add(bean1);
		
	}

	@Override
	public void listCustomer() {
		// TODO Auto-generated method stub
		System.out.println("this is list customer method");
		for(CustomerBean cus:customer) {
			  System.out.println("details of customer here-->" +cus.getCustomerid() +"--" +cus.getCustomername() + "--" +cus.getCustomerpincode() +"--" +cus.getCustomeraddress() +"--" +cus.getCustomerdob());
		}
	}

	@Override
	public void deleteCustomer() {
		// TODO Auto-generated method stub
		System.out.println("this is delete customer method");
		customer.remove(1);
	}

}
