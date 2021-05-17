package com.nagarro.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nagarro.dto.HRManager;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure().addAnnotatedClass(HRManager.class);
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        HRManager hrm = new HRManager();
        hrm.setHrId("shiv");
        hrm.setHrPswd("abcd");
        session.save(hrm);
        session.close();
	}

}
