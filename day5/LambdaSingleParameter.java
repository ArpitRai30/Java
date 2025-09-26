interface Square {
    int calculate(int x);
}

public class LambdaSingleParameter {
    public static void main(String[] args) {
        // lambda expression with single parameter
        Square square = (n) -> n*n;

        System.out.println("Square of 5 is " + square.calculate(5));
        System.out.println("Square of 9 is " + square.calculate(9));
    }
}
