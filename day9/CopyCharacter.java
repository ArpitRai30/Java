package day9;
import java.util.Scanner;

public class CopyCharacter {
    public static String copyChar(String input) {
        String first2chars = input.length() >= 2 ? input.substring(0, 2) : input;
        StringBuilder result = new StringBuilder();
        for (int i=0; i<input.length(); i++) {
            result.append(first2chars);
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();

        System.out.println(copyChar(input));
    }
}
