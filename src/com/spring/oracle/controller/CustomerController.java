package com.spring.oracle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.oracle.entity.Customer;
import com.spring.oracle.service.CustomerService;

@BasePathAwareController
@RequestMapping(value="/customer/custom")
public class CustomerController {
	
	@Autowired private CustomerService customerService;

	@RequestMapping(value="/getCustomerById", method=RequestMethod.GET)
	public @ResponseBody ResponseEntity<Customer> getCustomerById(@RequestParam(value="customerId") Long customerId){
		Customer customer = customerService.getCustomerById(customerId);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
}
