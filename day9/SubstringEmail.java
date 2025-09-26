package day9;
import java.util.Scanner;

public class SubstringEmail {
    public static String emailChecker(String mail) {
        String domain = mail.substring(mail.indexOf('@'), mail.length());
        String platform = "";
        if (domain.equals("@gmail.com")) {
            platform = "Google";
        }
        else if (domain.equals("@outlook.com")) {
            platform = "Outlook";
        }
        else if (domain.equals("@niet.co.in")) {
            platform = "NIET";
        }
        return platform;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String mail = sc.nextLine();

        System.out.println("Mail Platform: " + emailChecker(mail));
    }
}
