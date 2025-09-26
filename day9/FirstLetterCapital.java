package day9;
import java.util.Scanner;

public class FirstLetterCapital {
    public static String titalFormat(String input) {
        StringBuilder result = new StringBuilder(input);
        for(int i=0; i<result.length(); i++) {
            char ch = result.charAt(i);
            if (i==0) {
                result.setCharAt(i, Character.toUpperCase(ch));
            }
            else if (ch == ' ' && i != input.length()-1) {
                result.setCharAt(i+1, Character.toUpperCase(result.charAt(i+1)));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String input = sc.nextLine();

        System.out.println("New String: " + titalFormat(input));
    }
}
