import java.util.Scanner;

public class Assert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        assert age >= 18 : "Age is less than 18, not eligible to vote!";

        System.out.println("Age is valid. You can vote!");
    }
}
