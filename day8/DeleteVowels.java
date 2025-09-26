package day8;

public class DeleteVowels {
    public static void main(String[] args) {
        String input = "Hello World From JAVA";

        StringBuilder str = new StringBuilder(input);
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.toLowerCase(ch) == 'a' || Character.toLowerCase(ch) == 'e' || Character.toLowerCase(ch) == 'i' || Character.toLowerCase(ch) == 'o' || Character.toLowerCase(ch) == 'u') {
                str.deleteCharAt(i);
            }
        }
        System.out.println(str);
    }
}
