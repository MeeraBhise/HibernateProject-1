package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
    public static void main(String[] args) {
        org.hibernate.cfg.Configuration cfg = new Configuration();
        // cfg.configure("com.tut.hibernate.cfg.xml");
        cfg.configure("resources/hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();


        Session session=factory.openSession();
        student st=(student) session.load(student.class,102);
        System.out.println(st);
        }
    }
