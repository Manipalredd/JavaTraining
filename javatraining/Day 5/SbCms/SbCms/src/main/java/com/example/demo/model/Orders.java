package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

public class Orders {

	@Id
	private int ordId;
	private int cusId;
	private int venId;
	private int menId;
	private String walSource;
	private Date ordDate;
	private int ordQuantity;
	private double ordBillamount;
	private String ordStatus;
	private String ordComments;
	
	
	public Orders(int ordId, int cusId, int venId, int menId, String walSource, Date ordDate, int ordQuantity,
			double ordBillamount, String ordStatus, String ordComments) {
		super();
		this.ordId = ordId;
		this.cusId = cusId;
		this.venId = venId;
		this.menId = menId;
		this.walSource = walSource;
		this.ordDate = ordDate;
		this.ordQuantity = ordQuantity;
		this.ordBillamount = ordBillamount;
		this.ordStatus = ordStatus;
		this.ordComments = ordComments;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getOrdId() {
		return ordId;
	}
	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public int getVenId() {
		return venId;
	}
	public void setVenId(int venId) {
		this.venId = venId;
	}
	public int getMenId() {
		return menId;
	}
	public void setMenId(int menId) {
		this.menId = menId;
	}
	public String getWalSource() {
		return walSource;
	}
	public void setWalSource(String walSource) {
		this.walSource = walSource;
	}
	public Date getOrdDate() {
		return ordDate;
	}
	public void setOrdDate(Date ordDate) {
		this.ordDate = ordDate;
	}
	public int getOrdQuantity() {
		return ordQuantity;
	}
	public void setOrdQuantity(int ordQuantity) {
		this.ordQuantity = ordQuantity;
	}
	public double getOrdBillamount() {
		return ordBillamount;
	}
	public void setOrdBillamount(double ordBillamount) {
		this.ordBillamount = ordBillamount;
	}
	public String getOrdStatus() {
		return ordStatus;
	}
	public void setOrdStatus(String ordStatus) {
		this.ordStatus = ordStatus;
	}
	public String getOrdComments() {
		return ordComments;
	}
	public void setOrdComments(String ordComments) {
		this.ordComments = ordComments;
	}
	
	
	
	
}
