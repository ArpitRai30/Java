package day8;

public class CapitalLettersUsingString {
    public static void main(String[] args) {
        String str = "Hello World From JAVA";
        String result = "";
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result = result + ch;
            }
        }
        System.out.println("Capital Letters:  " + result);
    }
}
