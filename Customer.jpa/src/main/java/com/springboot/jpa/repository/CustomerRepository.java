package com.springboot.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.jpa.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	public Customer findByName(String name);
	public Customer findByAccountNo(int accountNo);
}
