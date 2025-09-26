import java.util.Scanner;
public class ArmstrongNumber {
    public void isArmstrongNumber(int n) {
        int num = n;
        int sum = 0;
        while (num!=0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }
        if (sum == n)
            System.out.println("Given number is an Armstrong Number");
        else
            System.out.println("Given number is not an Armstrong Number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check Armstrong Number:");
        int n = sc.nextInt();
        ArmstrongNumber a = new ArmstrongNumber();
        a.isArmstrongNumber(n);
    }
}
