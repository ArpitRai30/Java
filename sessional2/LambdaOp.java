package sessional2;

interface MathOperation {
    public int operation(int a, int b);
}

public class LambdaOp implements MathOperation {
    public static void main(String[] args) {
        MathOperation add = (a,b) -> a+b;
        MathOperation mult = (a,b) -> a*b;
        
        System.out.println("Sum of 4 and 5 is " + add.operation(4, 5));
        System.out.println("Product of 9 and 4 is " + mult.operation(9, 4));
    }
}