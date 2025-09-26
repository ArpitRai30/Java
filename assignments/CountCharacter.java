import java.util.Scanner;
public class CountCharacter {
    static int charCount(String input) {
        int count = 0;
        for (int i=0; i<input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();
        System.out.println("Number of characters is: " + charCount(input));
    }
}
