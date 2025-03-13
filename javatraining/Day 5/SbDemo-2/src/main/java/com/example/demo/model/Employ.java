package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employ")
public class Employ {
	
@Id
private int empno;
private String name;

private String dept;
private String desig;
private String basic;
public Employ(int empno, String name, String dept, String desig, String basic) {
	super();
	this.empno = empno;
	this.name = name;
	this.dept = dept;
	this.desig = desig;
	this.basic = basic;
}
public Employ() {
	super();
	// TODO Auto-generated constructor stub
}
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getDesig() {
	return desig;
}
public void setDesig(String desig) {
	this.desig = desig;
}
public String getBasic() {
	return basic;
}
public void setBasic(String basic) {
	this.basic = basic;
}



}
