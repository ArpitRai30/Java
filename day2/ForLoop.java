// package Day2;

import java.util.Scanner;
public class ForLoop {
    public void factorial(int n) {
        int fact=1;
        for (int i=n; i>=1; i--) {
            fact *= i; 
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int n = sc.nextInt();
        ForLoop f = new ForLoop();
        f.factorial(n);
        
    }
}
