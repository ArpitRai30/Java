// package Day2;

import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num a: ");
        int a = sc.nextInt();
        System.out.print("Enter num b: ");
        int b = sc.nextInt();
        if (a>b)
            System.out.println("Num a is greater");
        else
            System.out.println("Num b is greater");

    }
}
