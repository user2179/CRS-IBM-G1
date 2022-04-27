package com.ibm.dao;

import java.util.List;

import com.ibm.bean.Customer;

public interface CustomerDAO {
	public List list();
	public Customer get(Long id);
	public Customer create(Customer customer);
	public Long delete(Long id);
	public Customer update(Long id, Customer customer);
	
	
}
