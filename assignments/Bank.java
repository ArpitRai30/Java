public class Bank {
    public void deposit(int amount) {
        System.out.println("Amount: "+amount);
    }

    public void deposit(int amount, int accountNumber) {
        System.out.println("Account No.: "+accountNumber);
        System.out.println("Amount: "+amount);
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        b.deposit(1000);
        b.deposit(1000, 24013301);
    }
}
