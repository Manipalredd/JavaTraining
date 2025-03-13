package com.java.dao;

import java.util.List;

import com.java.Hib.model.Employ;

public interface EmployDao {
	List<Employ> showEmployDao();
	Employ searchEmployDao(int empno);
	String updateEmployDao(Employ employ);
	String deleteEmployDao(int empno);
	String addEmployDao(Employ employ);

}
