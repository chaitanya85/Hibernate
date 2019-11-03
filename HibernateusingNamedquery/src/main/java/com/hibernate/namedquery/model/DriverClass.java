package com.hibernate.namedquery.model;

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
		Session session =factory.openSession();
		Transaction tx = session.beginTransaction();
		//Cart cart = new Cart();
		Query bookquery = session.getNamedQuery("SelectOperationforCart");
		List list = bookquery.list();
System.out.println(list);
//bookquery = session.getNamedQuery("UpdateOperationforCart");
//session.update(bookquery);
/*Query deletequery = session.getNamedQuery("DeleteOperationforCart");
deletequery.setInteger(0, 3);
int i = deletequery.executeUpdate();
System.out.println(i+" record was deleted from the Record");*/
tx.commit();
session.close();
factory.close();
	}
}
