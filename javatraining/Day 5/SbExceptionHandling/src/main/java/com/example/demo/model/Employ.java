package com.example.demo.model;
 
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employ {
	@Id
	private int empno;
	private String name;
	private String gender;
	private String dept;
	private String design;
	private double basic;
	
 
}