package com.java.HB_Demo;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class EmploySearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empno;
		Scanner scan = new Scanner(System.in);
		empno=scan.nextInt();
		System.out.println("Enter Employ No : ");
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("from Employ where empno =" + empno);
		Employ employ = (Employ)query.uniqueResult();
		if(employ!= null) {
			System.out.println(employ);
			
		} else {
			
			System.out.println("**** Employ Not Found *****");
		}
		

	}

}
