package day10;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Shared resource 
class Counter {
    private int count = 0;
    private Lock lck = new ReentrantLock(); // Explicit Lock

    //method to increment the counter
    public void increment() {
        lck.lock(); // Acquire the lock
        try {
            count++; // critical section
            System.out.println(Thread.currentThread().getName() + " incremented count to " + count);
        }
        finally {
            lck.unlock(); // Release the lock
        }
    }

    public int getCount() {
        return count;
    }
}

//Runnable class that increments the counter
class CounterIncrementer implements Runnable {
    private Counter counter;
    public CounterIncrementer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            counter.increment(); // increment the counter

            try {
                Thread.sleep(100); //Simulate some work
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SyncWithLock {
    public static void main(String[] args) {
        Counter counter = new Counter(); //Shared counter object
        CounterIncrementer c1 = new CounterIncrementer(counter);
        
        //Create multiple threads
        Thread t1 = new Thread(c1, "Thread-1");
        Thread t2 = new Thread(new CounterIncrementer(counter), "Thread-2");
        Thread t3 = new Thread(new CounterIncrementer(counter), "Thread-3");

        //Start the threads
        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Final count
        System.out.println("Final count: " + counter.getCount());
    }
}
