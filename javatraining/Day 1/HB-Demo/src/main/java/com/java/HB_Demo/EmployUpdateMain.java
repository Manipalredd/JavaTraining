package com.java.HB_Demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class EmployUpdateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employ employ = new Employ();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Employ No ");
        employ.setEmpno(sc.nextInt());
        System.out.println("Enter Employ Name ");
        employ.setName(sc.next());
        System.out.println("Enter Gender (MALE/FEMALE) ");
        employ.setGender(sc.next());
        System.out.println("Enter Department ");
        employ.setDept(sc.next());
        System.out.println("Enter Designation ");
        employ.setDesig(sc.next());
        System.out.println("Enter Basic");
        employ.setBasic(sc.nextDouble());
        SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction trans = session.beginTransaction();
        session.update(employ);
        trans.commit();
        System.out.println("*** Employ record updated");


	}

}
