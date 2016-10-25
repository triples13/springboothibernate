package com.castsoftware.JpaBoot;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeDao {

    private static final Session sessionFactory = buildSessionFactory();

    private static Session buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory().openSession();
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
    	// Close caches and connection pools
    	getSessionFactory().close();
    }

}