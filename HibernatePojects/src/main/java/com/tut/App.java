package com.tut;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class App 
{
    public static void main( String[] args ) {
        System.out.println("Application started");

        Configuration cfg = new Configuration();
       // cfg.configure("com.tut.hibernate.cfg.xml");
        cfg.configure("resources/hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
/*
        System.out.println(factory);
        System.out.println(factory.isClosed());
        System.out.println(factory.isOpen());
*/
        //creating student
        student st=new student();
        st.setId(101);
        st.setName("meera");
        st.setCity("latur");
        System.out.println(st);

        student st1=new student();
        st.setId(102);
        st.setName("mehar");
        st.setCity("pune");
        System.out.println(st1);
        //creating object od addressclass
        Address address=new Address();
        address.setStreet("street1");
        address.setAddressId(102);
        address.setCity("latur");
        address.setOpen(true);
        address.setAddedDate(new Date());
        //
        Address address1=new Address();
        address1.setStreet("street2");
        address1.setAddressId(104);
        address1.setCity("PUNE");
        address1.setOpen(true);
        address1.setAddedDate(new Date());
        //
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(st);
        session.save(st1);
        //
        session.save(address);
        session.save(address1);
        tx.commit();
        session.close();
        factory.close();
        System.out.println("done");
    }
}
