interface Calculate {
    int operate(int a, int b);
}

public class LambdaMultiParameter {
    public static void main(String[] args) {
        Calculate add = (a, b) -> a + b;
        Calculate multiply = (a, b) -> a * b;

        System.out.println("Sum of 10 and 5 is " + add.operate(10, 5));
        System.out.println("Product of 10 and 5 is " + multiply.operate(10, 5));
    }    
}
