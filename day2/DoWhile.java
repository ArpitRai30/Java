// package Day2;

import java.util.Scanner;
public class DoWhile {
    public void fibonacci(int n) {
        int a=0, b=1, i=0;
        do {
            System.out.print(a+" ");
            int f=a+b;
            a=b;
            b=f;
            i++;
        } while(i<n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers to display: ");
        int n = sc.nextInt();
        DoWhile fib = new DoWhile();
        fib.fibonacci(n);
    }
}
