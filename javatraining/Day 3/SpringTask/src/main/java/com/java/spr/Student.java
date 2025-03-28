package com.java.spr;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int sno;
	private String name;
	@Autowired
	private LunchBox lunchBox;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LunchBox getLunchBox() {
		return lunchBox;
	}
	public void setLunchBox(LunchBox lunchBox) {
		this.lunchBox = lunchBox;
	}
	
	public void display() {
		System.out.println("Sno  " +sno+ " Student Name  " +name);
		lunchBox.eat();
	}

}
