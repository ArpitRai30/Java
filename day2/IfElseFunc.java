// package Day2;

public class IfElseFunc {
    public void checkBalance(double balance) {
        if (balance < 1000) 
            System.out.println("Balance is low");
        else if (balance >= 1000 && balance < 2000)
            System.out.println("Medium Balance");
        else
            System.out.println("Sufficient balance");
    }

    public static void main(String[] args) {
        IfElseFunc bc = new IfElseFunc();

        bc.checkBalance(500);
        bc.checkBalance(1500);
        bc.checkBalance(4000);
    }
}
