package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

public class Wallet {

	@Id
	private int walId;
	private int cusId;
	private String walSource;
	
	@Column(name = "WAL_AMOUNT")
	private double walAmount;

	public Wallet(int walId, int cusId, String walSource, double walAmount) {
		super();
		this.walId = walId;
		this.cusId = cusId;
		this.walSource = walSource;
		this.walAmount = walAmount;
	}

	public Wallet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getWalId() {
		return walId;
	}

	public void setWalId(int walId) {
		this.walId = walId;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public String getWalSource() {
		return walSource;
	}

	public void setWalSource(String walSource) {
		this.walSource = walSource;
	}

	public double getWalAmount() {
		return walAmount;
	}

	public void setWalAmount(double walAmount) {
		this.walAmount = walAmount;
	}
	
	
	
	
}
