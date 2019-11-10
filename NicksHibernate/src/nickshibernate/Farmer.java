/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nickshibernate;

/**
 *
 * sandboxed from https://www.tutorialspoint.com/hibernate/hibernate_quick_guide.htm
 */
public class Farmer {
   private int id;
   private String firstName; 
   private String lastName;   
   private int acres;  

   public Farmer() {}
   public Farmer(String fname, String lname, int acres) {
      this.firstName = fname;
      this.lastName = lname;
      this.acres = acres;
   }
   
   public int getId() {
      return id;
   }
   
   public void setId( int id ) {
      this.id = id;
   }
   
   public String getFirstName() {
      return firstName;
   }
   
   public void setFirstName( String first_name ) {
      this.firstName = first_name;
   }
   
   public String getLastName() {
      return lastName;
   }
   
   public void setLastName( String last_name ) {
      this.lastName = last_name;
   }
   
   public int getSalary() {
      return acres;
   }
   
   public void setSalary( int acres ) {
      this.acres = acres;
   }
}
