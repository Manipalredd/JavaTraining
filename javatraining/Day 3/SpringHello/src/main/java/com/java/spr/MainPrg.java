package com.java.spr;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPrg {

	public static void main(String[] args) {
          ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/HelloWorld.xml");
		  HelloWorld hello=null;
		  Date date = new Date();
		  int hr=date.getHours();
		  if(hr<12) {
			  hello=(HelloWorld) ctx.getBean("bean1");
		  }
		  if(hr>=12 && hr<16) {
			  hello=(HelloWorld) ctx.getBean("bean2");
		  }
		  if(hr>=16) {
			  hello=(HelloWorld) ctx.getBean("bean3");
		  }
		  System.out.println(hello.show("prasanna"));
	}

}

