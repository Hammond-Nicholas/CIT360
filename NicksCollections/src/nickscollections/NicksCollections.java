/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nickscollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

/**
 *
 * @author nrham
 */
public class NicksCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Demonstrate Set, List, Map, Queue, Tree
    
        // HashSet, implementation of Set
        // Define HashSet
        HashSet<String> pies = new HashSet<String>();
        // Add values to HashSet
        pies.add("Apple");
        pies.add("Peach");
        pies.add("Pumpkin");
        pies.add("Apple");
        pies.add("Pecan");
        // Print HashSet   
        System.out.println("Entries in HashSet: ");
        for(String pie : pies) {
            System.out.printf("%s, ", pie);
        }
        System.out.println("\nValues Entered: \nApple, Peach, Pumpkin, Apple, Pecan");

        // ArrayList, implmentation of List
        ArrayList<String> destinations = new ArrayList<String>();
        // Add values to ArrayList
        destinations.add("Lima");
        destinations.add("Rio");
        destinations.add("Panama");
        // Print ArrayList
        System.out.println("\n \nDestinations: ");
        for(String dest : destinations) {
            System.out.printf("%s, ", dest);
        }
        // Clear ArrayList
        destinations.clear();
        // Add New Values to ArrayList
        destinations.add("Nashville");
        destinations.add("Boston");
        destinations.add("Atlanta");
        // Print New ArrayList
        System.out.println("\nNew Destinations: ");
        for(String newdest : destinations) {
            System.out.printf("%s, ", newdest);
        }

        // HashMap, implemenation of Map
        HashMap<String, String> games = new HashMap<String, String>();
        // Add Values to HashMap
        games.put("Xbox", "Halo");
        games.put("Play Station", "Final Fantasy");
        games.put("Android", "Clash of Clans");
        // Print HashMap
        System.out.println("\n \n");
        for (String game : games.keySet())
        {
            System.out.println(games.get(game) + " is available on " + game);
        }

        // PriorityQueue, implmentation of Queue
        PriorityQueue<String> members = new PriorityQueue<String>();
        // Add Values to PriorityQueue
        members.add("Gary");
        members.add("Nathan");
        members.add("Alice");
        members.add("Calvin");
        members.add("Steve");
        members.add("Buck");
        members.add("Tara");
        members.add("Megan");
        // Print PriorityQueue
        System.out.println("\n \nOrder in PriorityQueue: ");
        for (String member : members) {
            System.out.printf("%s, ", member);
        }
        System.out.println("\nOrder Entered: \nGary, Nathan, Alice, Calvin, Steve, Buck, Tara, Megan.");

        // TreeSet, implementation of Set
        TreeSet<String> runners = new TreeSet<String>();
        // Set Values to TreeSet
        runners.add("Gary");
        runners.add("Nathan");
        runners.add("Alice");
        runners.add("Calvin");
        runners.add("Steve");
        runners.add("Buck");
        runners.add("Tara");
        runners.add("Megan");
        // Print Values From TreeSet
        System.out.println("\n \nRunners: ");
        for (String runner : runners){
            System.out.printf("%s, ", runner);
        }
        String runner1 = "Megan";
        System.out.println("\n" + runners.higher(runner1) + " is higher in the collection than " + runner1);
    }
    
}
