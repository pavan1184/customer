package com.springboot.jpa.service;

import java.util.List;

import com.springboot.jpa.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();
	public Customer addCustomer(Customer customer);
	public Customer getCustomer(String name);
	public Customer getCustomer(int accountNo);
	public Customer deleteCustomer(int accountNo);
}
