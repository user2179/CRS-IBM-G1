package com.ibm.restcontroller;

import java.util.ArrayList;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.bean.Customer;
import com.ibm.dao.CustomerDAO;

@RestController
@CrossOrigin
//@RequestMapping("/customerService")
public class CustomerController {

	// injecting dependency of CustomerDAO obj using Autowire
	@Autowired
	private CustomerDAO customerDAO;

	@RequestMapping("/customers")
	public List getCustomers() {

		return customerDAO.list();
	}

	// this is a getmethod for customer detail by id
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/customer/{id}")
	@ResponseBody
	public ResponseEntity getCustomer(@PathVariable("id") Long id) {

		Customer customer = customerDAO.get(id);
		if (customer == null) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(customer, HttpStatus.OK);
	}

	// this is a post method which is responsible to create the customer
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/post/customers")
	@ResponseBody
	public ResponseEntity createCustomer(@RequestBody Customer customer) {

		customerDAO.create(customer);

		return new ResponseEntity(customer, HttpStatus.OK);
	}

	// this is a delete method which is responsible to delete the customer
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.DELETE, value = "/delete/customers/{id}")
	@ResponseBody
	public ResponseEntity deleteCustomer(@PathVariable Long id) {

		if (null == customerDAO.delete(id)) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(id, HttpStatus.OK);

	}

	// this is a put method which is responsible to update the customer by id
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.PUT, value = "/put/customers/{id}")
	@ResponseBody
	@PutMapping("/put/customers/{id}")
	public ResponseEntity updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {

		customer = customerDAO.update(id, customer);

		if (null == customer) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(customer, HttpStatus.OK);
	}

}