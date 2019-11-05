package com.spring.oracle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.oracle.entity.Customer;
import com.spring.oracle.repo.CustomerRepo;
import com.spring.oracle.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

	@Autowired private CustomerRepo customerRepo;
	
	@Override
	public Customer getCustomerById(Long customerId) {
		Customer customer = customerRepo.findById(customerId).orElse(null);
		log.info("customerId: {} data: {}", customerId, customer);
		return customer;
	}

}
