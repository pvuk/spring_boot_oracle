package com.spring.oracle.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.spring.oracle.entity.Customer;

public interface CustomerRepo extends PagingAndSortingRepository<Customer, Long> {

}
