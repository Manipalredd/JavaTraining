package com.java.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.dao.EmployDaoImpl;
import com.java.model.Employ;

public class EmployShowMain {

	public static void main(String[] args) {
         ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/Jdbc.xml");
         EmployDaoImpl impl = (EmployDaoImpl) ctx.getBean("employDao");
         System.out.println("Connected to Db");
         List<Employ> employlist = impl.showEmployDao();
         for (Employ employ : employlist) {
			System.out.println(employ);
		}
         

	}

}
