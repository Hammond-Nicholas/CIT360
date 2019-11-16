/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicksthreads;
import java.lang.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
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
        // Define AtomicInteger counter
        Counter counter = new Counter();
        // Start Pies as Thread
        Pies pieThread = new Pies(counter);
        pieThread.start();
        // Start executor
        ExecutorService es = Executors.newFixedThreadPool(5);
        // Define Drinks as runnable
        Runnable drinkRun = new Drinks(counter);
        // Execute Drinks
        es.execute(drinkRun);
        // Shutdown Executor
        es.shutdown();
    }
    
}

