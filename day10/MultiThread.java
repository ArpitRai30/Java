package day10;

public class MultiThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running...");
        for(int i=1; i<=1000; i++) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        MultiThread mt = new MultiThread();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        t1.start();
        t2.start();
    }
}
