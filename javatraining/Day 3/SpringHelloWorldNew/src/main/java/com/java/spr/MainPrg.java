package com.java.spr;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPrg {

	public static void main(String[] args) {
     String sname;
     Scanner scan = new Scanner(System.in);
     System.out.println("enter person name  ");
     sname=scan.nextLine();
     ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/HelloWorld.xml");
     HelloWorld hello = (HelloWorld)ctx.getBean("beanHelloWorld");
     hello.show(sname);
     
     

	}

}
