interface Lambda {
    int op(int a, int b);
}

public class LambdaMultiPara {
    public static void main(String[] args) {
        Lambda add = (a, b) -> a+b;
        Lambda sub = (a, b) -> a-b;

        System.out.println("Sum of 4 and 5: " + add.op(4, 5));
        System.out.println("Difference of 9 and 7: " + sub.op(9, 7));
    }
}
