package day8;
import java.util.Scanner;

public class CountDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dup=0;
        System.out.print("Enter string: ");
        String input = sc.nextLine();

        StringBuilder str = new StringBuilder(input);

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            for (int j=i; j<str.length(); j++) {
                char ch1 = str.charAt(j);
                if (Character.toLowerCase(ch) == Character.toLowerCase(ch1)) {
                    dup++;
                    str.deleteCharAt(j);
                }
            }
        }

        System.out.println("No. of duplicates: " + dup);
    }
}
