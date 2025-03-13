package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/java/spr/Task.xml");
			Student person1 = (Student)ctx.getBean("lunchbox");
			person1.display();
			

	}

}
