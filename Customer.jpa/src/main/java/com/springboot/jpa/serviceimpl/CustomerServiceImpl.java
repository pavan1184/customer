package com.springboot.jpa.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.entity.Customer;
import com.springboot.jpa.repository.CustomerRepository;
import com.springboot.jpa.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomer(String name) {
		return customerRepository.findByName(name);
	}

	@Override
	public Customer getCustomer(int accountNo) {
		return customerRepository.findByAccountNo(accountNo);
	}

	@Override
	public Customer deleteCustomer(int accountNo) {
		Customer customer = getCustomer(accountNo);
		customerRepository.delete(customer);
		return customer;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

}
