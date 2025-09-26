import java.util.Scanner;

public class CountPunctuations {
    static int puncCount(String input) {
        int count = 0;
        String punctuations = ",.;-!??";
        for (int i=0; i<input.length(); i++) {
            char ch = input.charAt(i);
            if (punctuations.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();
        int count = puncCount(input);
        System.out.println("Number of punctuation characters: " + count);
    }
}
