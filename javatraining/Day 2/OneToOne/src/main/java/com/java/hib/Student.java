package com.java.hib;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int sid;
	 private String sname;
	 private String city;
	 private double cgpa;
	public Student(int sid, String sname, String city, double cgpa) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.city = city;
		this.cgpa = cgpa;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", city=" + city + ", cgpa=" + cgpa + "]";
	}
	 
	 
	 
	 
	 
	 
	

	
}
