// package Day2;

import java.util.Scanner;
public class While {
    public void fibonacci(int n) {
        int a=0, b=1, i=0;
        while (i<n) {
            System.out.print(a+" ");
            int f=a+b;
            a=b;
            b=f;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers to display: ");
        int n=sc.nextInt();
        While fibo = new While();
        fibo.fibonacci(n);
    }
}
