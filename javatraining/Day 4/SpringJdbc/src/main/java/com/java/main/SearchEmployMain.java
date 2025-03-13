package com.java.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.dao.EmployDaoImpl;
import com.java.model.Employ;

public class SearchEmployMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No   ");
		empno = sc.nextInt();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/jdbc.xml");
		EmployDaoImpl impl = (EmployDaoImpl)ctx.getBean("employDao");
		Employ employ = impl.searchEmployDao(empno);
		if (employ != null) {
			System.out.println(employ);
		} else {
			System.out.println("*** Record Not Found ***");
		}

	}

}
