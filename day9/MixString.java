package day9;
import java.util.Scanner;

public class MixString {
    public static String alternateLetter(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        int len = str1.length() <= str2.length() ? str1.length() : str2.length();
        
        for (int i=0; i<len; i++) {
            result.append(str1.charAt(i));
            result.append(str2.charAt(i));
        }

        if (str1.length() > len) {
            result.append(str1.substring(len));
        }
        else if (str2.length() > len) {
            result.append(str2.substring(len));
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter String1: ");
        String s2 = sc.nextLine();

        System.out.println("Mixed String: " + alternateLetter(s1, s2));
    }
}
