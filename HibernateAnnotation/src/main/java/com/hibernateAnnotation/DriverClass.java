package com.hibernateAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DriverClass {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Student student = new Student();
//		student.setId(2);
		student.setStudentName("Ravali");
		student.setInstitute("java home techologies");
		student.setCourse("Testing");
		student.setDate("25/09/2017");
		session.save(student);
//		student = (Student)session.load(Student.class, 2);
	//	System.out.println(student);
		tx.commit();
		session.close();
		
		
	}

}
