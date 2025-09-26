//package Day2;

import java.util.Scanner;
public class Calculator {
    int a, b;
    char o;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1: ");
        a = sc.nextInt();
        System.out.print("Enter Num2: ");
        b = sc.nextInt();
        System.out.print("Enter Operation: ");
        o = sc.next().charAt(0);
    }
    public void calculate() {
        int r=0;
        switch(o) {
            case '+': r=a+b; break;
            case '-': r=a-b; break;
            case '*': r=a*b; break;
            case '/': r=a/b; break;
            default: System.out.println("Invalid Operation"); 
        }
        System.out.println("Result:" + r);
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.input();
        calc.calculate();
    }
}
