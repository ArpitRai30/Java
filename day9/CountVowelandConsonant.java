package day9;
import java.util.Scanner;

public class CountVowelandConsonant {
    public static int[] vowelAndConsonant(String input) {
        String vowels = "aeiou";
        int vowel=0, consonant=0;

        for (int i=0; i<input.length(); i++) {
            char ch = input.charAt(i);
            ch = Character.toLowerCase(ch);
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    vowel++;
                }
            
                else {
                    consonant++;
                }
            }
        }

        return new int[] {vowel, consonant};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String input = sc.nextLine();

        int[] counts = vowelAndConsonant(input);

        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }
}
