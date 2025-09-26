package day8;

class InvalidAgeException extends Exception {
    public InvalidAgeException (String message) {
        super(message);
    }
}
public class UserDefinedException {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // throw custom exception 
            throw new InvalidAgeException("Age must be 18 or above to vote.");
        }
        else {
            System.out.println("You are eligible for vote.");
        }
    }

    public static void main(String[] main) {
        try {
            int age = 14;
            checkAge(age);
        }
        catch (InvalidAgeException i) {
            System.out.println("Caught Exception: " + i.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
