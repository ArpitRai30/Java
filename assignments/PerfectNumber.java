import java.util.Scanner;
public class PerfectNumber {
    public void isPerfectNumber(int n) {
        int sum = 0;
        for (int i=1; i <= n/2; i++) {
            if (n % i == 0) 
                sum += i;
        }
        if (sum == n)
            System.out.println("Number is a Perfect Number");
        else
            System.out.println("Number is not a Perfect Number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check perfect number:");
        int n = sc.nextInt();
        PerfectNumber p = new PerfectNumber();
        p.isPerfectNumber(n);
    }
}
