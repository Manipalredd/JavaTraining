package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Menu {

	@Id
	@Column(name="MEN_ID")
	private int menId;
	private String menItem;
	private double menPrice;
	private double menCalories;
	public Menu(int menId, String menItem, double menPrice, double menCalories) {
		super();
		this.menId = menId;
		this.menItem = menItem;
		this.menPrice = menPrice;
		this.menCalories = menCalories;
	}
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMenId() {
		return menId;
	}
	public void setMenId(int menId) {
		this.menId = menId;
	}
	public String getMenItem() {
		return menItem;
	}
	public void setMenItem(String menItem) {
		this.menItem = menItem;
	}
	public double getMenPrice() {
		return menPrice;
	}
	public void setMenPrice(double menPrice) {
		this.menPrice = menPrice;
	}
	public double getMenCalories() {
		return menCalories;
	}
	public void setMenCalories(double menCalories) {
		this.menCalories = menCalories;
	}
	
	
	
}
