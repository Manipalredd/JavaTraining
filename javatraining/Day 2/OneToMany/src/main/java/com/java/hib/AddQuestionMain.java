package com.java.hib;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class AddQuestionMain {

	public static void main(String[] args) {
           SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();	
           Session session = sf.openSession();
           
           Question question1 = new Question();
           question1.setQname("what is java");
           
           Question question2 = new Question();
           question2.setQname("what is OOPs");
           
           Answer answer1 = new Answer();
           answer1.setAnswername("java is platform independent");
           answer1.setPostedBy("manipal");
           
           Answer answer2 = new Answer();
           answer2.setAnswername("Encapsulation");
           answer2.setPostedBy("reddy");
           
           Answer answer3 = new Answer();
           answer3.setAnswername("Abstraction");
           answer3.setPostedBy("gjh");
           
           
           Answer answer4 = new Answer();
           answer4.setAnswername("java is robust language");
           answer4.setPostedBy("prasanna");
           
           ArrayList<Answer> list1 = new ArrayList<Answer>();
           list1.add(answer1);
           list1.add(answer2);
           
           
           ArrayList<Answer> list2 = new ArrayList<Answer>();
           list1.add(answer3);
           list1.add(answer4);
           
           
         question1.setAnswers(list1);
   		 question2.setAnswers(list2);
           
           
   		Transaction trans = session.beginTransaction();
		session.save(question1);
		session.save(question2);
		trans.commit();
		System.out.println("Data Saved ");
           
           
           

	}

}
