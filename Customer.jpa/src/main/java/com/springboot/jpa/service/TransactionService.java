package com.springboot.jpa.service;

import com.springboot.jpa.entity.Customer;

public interface TransactionService {
	public Customer depositAmmout(int accountNo,double ammount);
	public Customer withdrawAmmount(int accountNo,double ammount);
	public double checkBalance(int accountNo);
}
