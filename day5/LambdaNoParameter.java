public class LambdaNoParameter {
    public static void main(String[] args) {
        Greeting greeting = () -> {
            System.out.println("Hello! Welcome to the lambda function.");
        };
        greeting.sayHello();
    }
}

interface Greeting {
    void sayHello();
}