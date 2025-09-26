package day8;

public class CapitalLettersUsingStringBuilder {
    public static void main(String[] args) {
        String input = "HeLLo WoRLd From Java";

        StringBuilder capitals = new StringBuilder();

        for (int i=0; i<input.length(); i++) {
            char ch = input.charAt(i);  // get each character
            if (Character.isUpperCase(ch)) {
                capitals.append(ch);
            }
        }

        System.out.println("Input String: " + input);
        System.out.println("Capital Letters Appended: " + capitals.toString());
    }
}
