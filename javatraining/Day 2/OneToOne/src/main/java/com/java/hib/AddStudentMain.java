package com.java.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class AddStudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Student student = new Student();
		student.setSname("manipal");
		student.setCity("bellary");
		student.setCgpa(6.79);
		
		Address address1 = new Address();
		address1.setAddress1("chanahal");
		address1.setAddress2("parvathi nagar");
		address1.setCity("bang");
		address1.setZipcode("678987");
		address1.setStudent(student);
		
		Transaction trans = session.beginTransaction();
		session.save(address1);
		trans.commit();
		System.out.println("Table created....Data saved");
		
		

	}
	

}
