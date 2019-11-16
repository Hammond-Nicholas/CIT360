/*
 * Project Name: NicksThreads
 * Package Name: nicksthreads
 * Class Name: Counter
 * 
 * Created on Nov 15, 2019, 11:09:34 PM
 * Created by Nick Hammond
 *
 * Purpose: <What is the purpose of the file?>
 */

package nicksthreads;
import java.util.concurrent.atomic.AtomicInteger;

// Code sandboxed from https://www.baeldung.com/java-atomic-variables 
public class Counter {
    // Declare AtomicInteger
    AtomicInteger atomicInt = new AtomicInteger(0);
    
    // Counter getter
    public int getValue() {
        return atomicInt.get();
    }

    // Counter incrementer
    public void increment() {
        atomicInt.incrementAndGet();
    }
}
