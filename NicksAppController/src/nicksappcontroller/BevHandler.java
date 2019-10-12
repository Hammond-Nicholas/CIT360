/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicksappcontroller;
import java.util.ArrayList;

/**
 * Code based off of Brad Lawrences repo:
 * https://github.com/Lawrence-Brad/ApplicationControllerExample/blob/master/src/main/handlers/DisplayBooksHandler.java
 */
public class BevHandler implements Handler{
    // BevHandler prints of list of Beverages
    @Override
    public Object handleIt(){
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
        } 
        return null;
    }
}
