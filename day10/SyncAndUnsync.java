package day10;

class Counter2 {
    private int c=0;  // shared variable

    // Synchronized method to inctement counter
    public void inc() {
        synchronized(this) {
            c++;
        }
        for (int i=0; i<100; i++) {
            System.out.print(i + " ");
        }
    }

    // Synchronized method to get ccounter value
    public synchronized int get() {
        return c;
    }
}
public class SyncAndUnsync {
    public static void main(String[] args) {
        Counter2 cnt = new Counter2();  // shared resource

        // Thread 1 to increment counter
        Thread t1 = new Thread(() -> {
            for (int i=0; i<1000; i++) {
                cnt.inc();
            }
        });

        // Thread 2 to increment counter
        Thread t2 = new Thread(() -> {
            for (int i=0; i<1000; i++) {
                cnt.inc();
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // wait for threads to finish
        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        // print final counter value
        System.out.println("\nCounter: " + cnt.get());
    }
}
