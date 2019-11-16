/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicksthreads;
import java.util.ArrayList;
import java.lang.Runnable;
/**
 * Drinks
 * Purpose: List off drinks
 * @author nrham
 */
public class Drinks implements Runnable {
    // Pass counter in constructor
    Counter counter;
    public Drinks(Counter _counter) {
        this.counter = _counter;
    }
    public void run(){
        // ArrayList of drinkFlavors
        ArrayList<String> drinkFlavors = new ArrayList<String>();
        // Add values to ArrayList
        drinkFlavors.add("Lemonade");
        drinkFlavors.add("Milk");
        drinkFlavors.add("Orange Juice");
        drinkFlavors.add("Grape Juice"); 
        drinkFlavors.add("Fanta"); 
        drinkFlavors.add("Sprite"); 
        drinkFlavors.add("Rootbeer"); 
        drinkFlavors.add("Sparkling Water");
        drinkFlavors.add("Water");
        // Print ArrayList
        for(String flav : drinkFlavors) {
            System.out.printf("%s \n", flav);
            System.out.println("Drink Counter: " + counter.getValue());
            counter.increment();
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
