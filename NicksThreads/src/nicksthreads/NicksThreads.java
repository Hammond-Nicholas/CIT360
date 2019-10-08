/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicksthreads;
import java.lang.*;
/**
 * NicksThreads
 * Purpose: Demonstrate the operation of Threads and Runnables
 * @author nrham
 */
public class NicksThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start Pies as Thread
        Pies pieThread = new Pies();
        pieThread.start();
        
        // Start Drinks as Runnable
        Thread drinkThread = new Thread(new Drinks());
        drinkThread.start();
        
    }
    
}

