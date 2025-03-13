package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Model.Customer;
import com.example.demo.repository.CustomerRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerService {
	
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	public List<Customer> showCustomer(){
		return customerRepository.findAll();
	}
	
	public Customer serachById(int id) {
		return customerRepository.findById(id).get();
	}
	
	public Customer searchCustomerByName(String UserName) {
		return customerRepository.findBycusUser(UserName);
	}
	public String login(String cusUser, String cusPassword) {
		long count= customerRepository.countBycusUserAndPassword(cusUser, cusPassword);
		String res ="";
		res+=count;
		return res;
	}
	
}
