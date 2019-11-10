/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nickshibernate;
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 *
 * sandboxed from https://www.tutorialspoint.com/hibernate/hibernate_quick_guide.htm
 */

public class NicksHibernate {
   private static SessionFactory factory; 
   public static void main(String[] args) {
      
      // create new hibernate session, opened later
      try {
         factory = new Configuration().configure().buildSessionFactory();
      } catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      
      NicksHibernate ME = new NicksHibernate();

      // Add new Farmer to database
      Integer farmer1 = ME.addFarmer("Perry", "Claus", 8000);

   }
   
   // Method to CREATE a farmer in the database 
   public Integer addFarmer(String fname, String lname, int acres){
      // open session
      Session session = factory.openSession();
      // transaction is a hibernate function to exchange data
      Transaction tx = null;
      Integer farmerID = null;
      
      // send farmer object attributes through transaction
      try {
         tx = session.beginTransaction();
         Farmer farmer = new Farmer(fname, lname, acres);
         farmerID = (Integer) session.save(farmer); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
      return farmerID;
   }
   
}