package com.test.Student;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args )
    {
       User user = new User();
       user.setStudentid(105);
       user.setSname("sameer");
       user.setSresult("pass");
       Transaction tx=null;
       Session session = HibernateUtil.getSessionFactory().openSession();
   	try{
            
   	      tx = session.beginTransaction();

             //Insert a new student record in the database.
   	      session.save(user);

          
   	      tx.commit();
   	      System.out.println("Saved Successfully.");
   	  }catch (HibernateException e) {
   	     if(tx!=null){
                
   	         tx.rollback();
   	     }
   	     e.printStackTrace(); 
   	  }finally {
           
   	     session.close(); 
   	  }
   
    }
}
