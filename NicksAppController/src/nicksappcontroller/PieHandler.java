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
public class PieHandler implements Handler{
    // PieHandler prints of list of Pies
    @Override
    public Object handleIt(){
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
        }
        return null;
    }
}
