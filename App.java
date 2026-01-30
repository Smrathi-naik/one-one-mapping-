package com.kodnest.mappingproject;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter street no, street name, city, state, country and pincode");
       Address address = new Address(scan.nextInt(), scan.next(), scan.next(), scan.next(), scan.next(), scan.nextInt());
    
       System.out.println("enter sname,smarks,sage");
       Student student = new Student(scan.next(), scan.nextInt(), scan.nextInt(), address);
    
       //hibernate steps
       SessionFactory factory = new Configuration().configure("hibernate.cfg.xml"). buildSessionFactory();
       Session session = factory.openSession();
       Transaction transaction = session.beginTransaction();
       session.persist(student);
       transaction.commit();
       session.close();
       factory.close();
       scan.close();
    
    }
}
