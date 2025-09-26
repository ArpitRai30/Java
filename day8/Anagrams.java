package day8;
import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
        }
        else {
            char[] a1 = str1.toCharArray();
            char[] a2 = str2.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            
            if (Arrays.equals(a1, a2)) 
                System.out.println("The Strings are Anagrams.");

            else
                System.out.println("Not Anagrams.");
        }
    }
}
