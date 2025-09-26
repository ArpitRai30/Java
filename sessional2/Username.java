package sessional2;
import java.util.Scanner;

public class Username {
    public static void extractUsername(String str) {
        String user = str.substring(0, str.indexOf('@'));
        System.out.println("Username = " + user);
        System.out.println("Tokens:\n" + user + "\n" + str.substring(str.indexOf('@')+1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email id: ");
        String mail = sc.nextLine();
        extractUsername(mail);
    }
}
