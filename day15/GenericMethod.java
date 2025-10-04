package day15;

public class GenericMethod {
    public static <T> void display(T data) {
        System.out.println("Data: " + data);
    }
    public static void main(String[] args) {
        display(100);
        display("Hello");
        display(3.14);
    }
}
