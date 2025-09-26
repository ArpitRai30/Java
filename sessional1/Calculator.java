package sessional1;
public class Calculator {
    int add(int a, int b) {
        return a+b;
    }

    int add(int a, int b, int c) {
        return a+b+c;
    }

    double add(double a, double b) {
        return a+b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two integers is " + calc.add(5, 7));
        System.out.println("Sum of three integers is " + calc.add(6,7,8));
        System.out.println("Sum of two doubles is " + calc.add(7.5, 6.8));
    }
}
