package day10;

class Runnable1 implements Runnable {
    @Override
    public void run() {
        for (int i=1; i<=500; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        Runnable1 myRunnable = new Runnable1();
        Thread t1 = new Thread(myRunnable);
        t1.start();
        System.out.println("Main thread is running.");
        Thread t2 = new Thread(myRunnable);
        t2.start();
    }
}
