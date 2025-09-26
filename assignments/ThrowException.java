import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException (String message) {
        super(message);
    }
}
public class ThrowException {
    static void voteAge(int age) throws InvalidAgeException {
        if (age<18) {
            throw new InvalidAgeException("Not valid for voting.");
        }
        else{
            System.out.println("Eligible for voting.");
        }
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            voteAge(age);
        }
        catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}
