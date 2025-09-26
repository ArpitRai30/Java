package sessional2;
import java.util.*;

public class Anagram {
    public static boolean anagramCheck(String input1, String input2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for(int i=0; i<input1.length(); i++) {
            if(Character.isLetter(input1.charAt(i))) {
                str1.append(Character.toLowerCase(input1.charAt(i)));
            }
        }
        for(int i=0; i<input2.length(); i++) {
            if(Character.isLetter(input2.charAt(i))) {
                str2.append(Character.toLowerCase(input2.charAt(i)));
            }
        }
        char[] a1 = str1.toString().toCharArray();
        char[] a2 = str2.toString().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string1: ");
        String input1 = sc.nextLine();
        System.out.print("Enter string2: ");
        String input2 = sc.nextLine();

        if(anagramCheck(input1, input2)) {
            System.out.println("Both strings are Anagrams");
        }
        else {
            System.out.println("Both strings are not Anagrams");
        }
    }
}
