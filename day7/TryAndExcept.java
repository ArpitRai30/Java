package day7;

public class TryAndExcept {
    public static void main(String[] args) {
        try {
            int a=10;
            int b=0;
            int result = a/b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            System.out.println("Error message: " + e.getMessage());
        }
        finally {
            System.out.println("Finally Block");
        }
    }
}