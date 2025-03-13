package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor



public class Customer {

	
	@Id
	@Column(name="CUS_ID")
	private int cusId;
	
	@Column(name="CUS_NAME")
	private String cusName;
	
	
	@Column(name="CUS_PHN_NO")
	private String cusPhnNo;
	
	
	@Column(name="CUS_USERNAME")
	private String cusUser;
	
	
	@Column(name="CUS_PASSWORD")
	private String cusPassword;
	
	
	@Column(name="CUS_EMAIL")
	private String cusEmail;


	public int getCusId() {
		return cusId;
	}


	public void setCusId(int cusId) {
		this.cusId = cusId;
	}


	public String getCusName() {
		return cusName;
	}


	public void setCusName(String cusName) {
		this.cusName = cusName;
	}


	public String getCusPhnNo() {
		return cusPhnNo;
	}


	public void setCusPhnNo(String cusPhnNo) {
		this.cusPhnNo = cusPhnNo;
	}


	public String getCusUser() {
		return cusUser;
	}


	public void setCusUser(String cusUser) {
		this.cusUser = cusUser;
	}


	public String getCusPassword() {
		return cusPassword;
	}


	public void setCusPassword(String cusPassword) {
		this.cusPassword = cusPassword;
	}


	public String getCusEmail() {
		return cusEmail;
	}


	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}


	public Customer(int cusId, String cusName, String cusPhnNo, String cusUser, String cusPassword, String cusEmail) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.cusPhnNo = cusPhnNo;
		this.cusUser = cusUser;
		this.cusPassword = cusPassword;
		this.cusEmail = cusEmail;
	}


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
