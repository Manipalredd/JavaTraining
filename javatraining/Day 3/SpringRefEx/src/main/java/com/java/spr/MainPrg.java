package com.java.spr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPrg {

	public static void main(String[] args) {
         ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/Person.xml");
         Person person1 = (Person) ctx.getBean("beanPersonSubhash");
         person1.showAllInfo();
         Person person2 = (Person) ctx.getBean("beanPersonReddy");
         person2.showAllInfo();


	}

}
