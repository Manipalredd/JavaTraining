package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	Customer findBycusUser(String cusUser);
	Long countBycusUserAndPassword(String cusUser,String cusPassword);
}
