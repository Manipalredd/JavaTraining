package com.example.demo.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping(value = "/showCustomer")
	public List<Customer>showCustomer(){
		return customerService.showCustomer();
	}
	
	@GetMapping("/searchCustomer/{id}")
	public ResponseEntity<Customer> get(@PathVariable int id){
		try {
			Customer customer=customerService.serachById(id);
			return new ResponseEntity<Customer>(customer,HttpStatus.OK);
			
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		}
		return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);  
	}

	@GetMapping(value="/searchCustomerByUser/{cusUserName}")
	public ResponseEntity<Customer> searchCustomerByName(@PathVariable String cusUserName) {
		try {
			Customer customer=customerService.searchCustomerByName(cusUserName);
			return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		} catch(Exception c) {
		return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping(value="/customerLogin/{user}/{pwd}")
	public String login(@PathVariable String user,@PathVariable String pwd) {
		return customerService.login(user, pwd);
	}
	

}
