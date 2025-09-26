import java.util.Scanner;
public class Palindrome {
    public void isPalindrome(int n) {
        int num = n;
        int rev = 0;
        while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        if (n == rev) 
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check Palindrome:");
        int n = sc.nextInt();
        Palindrome p = new Palindrome();
        p.isPalindrome(n);
        sc.close();
    }
}
