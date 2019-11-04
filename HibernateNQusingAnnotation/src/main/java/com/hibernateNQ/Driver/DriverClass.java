package com.hibernateNQ.Driver;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DriverClass {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Query cart = session.getNamedQuery("SelectOperationforCart");
		Query cart1 = session.getNamedQuery("InsertOperationforCart");
		session.save(cart1);
//		System.out.println(i+"record has added to your data table");
		List list = cart.list();
		System.out.println(list);
		tx.commit();
		session.close();
		factory.close();
	}

}
