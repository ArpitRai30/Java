package day10;

public class Multi extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
        for(int i=1; i<=1000; i++) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Multi t1 = new Multi();
        Multi t2 = new Multi();
        t1.start();
        t2.start();
    }
}
