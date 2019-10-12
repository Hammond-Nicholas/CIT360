/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicksthreads;
import java.util.ArrayList;
import java.lang.Thread;
/**
 * Pies
 * Purpose: Print off list of pies
 * @author nrham
 */
public class Pies extends Thread {
    
    public void run(){
        // ArrayList of pieFlavors
        ArrayList<String> pieFlavors = new ArrayList<String>();
        // Add values to ArrayList
        pieFlavors.add("Lemon");
        pieFlavors.add("Apple");
        pieFlavors.add("Coconut Cream");
        pieFlavors.add("Cherry"); 
        pieFlavors.add("Peach"); 
        pieFlavors.add("Pumpkin"); 
        pieFlavors.add("Sugar Cream"); 
        pieFlavors.add("Rhubarb");
        pieFlavors.add("Mississippi Mud");
        // Print ArrayList
        for(String flav : pieFlavors) {
            System.out.printf("%s Pie\n", flav);
            // Try/Catch taken from StackOverflow
            // https://stackoverflow.com/questions/24104313/how-do-i-make-a-delay-in-java
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }
    }
}
