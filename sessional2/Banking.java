package sessional2;

class LessBalanceException extends Exception {
    LessBalanceException(String message) {
        super(message);
    }
}

class Account {
    String name;
    double balance;
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Rs." + amount + " deposited in " + name + ". Remaining balance is " + balance);
    }
    public void withdraw(double amount) throws LessBalanceException {
        if(balance-amount <= 500) {
            throw new LessBalanceException("Minimum balance should be 500");
        }
        balance -= amount;
        System.out.println("Rs." + amount + "withdrew from " + name + ". Remaining balance is " + balance);
    }
}
public class Banking {
    public static void main(String[] args) {
        Account a1 = new Account("Arpit", 2000);
        Account a2 = new Account("Dev", 1500);
        a1.deposit(500);
        a2.deposit(1700);
        try {
            a1.withdraw(1500);
            a2.withdraw(3000);
        }
        catch (LessBalanceException l) {
            System.out.println("Caught Exception: " + l.getMessage());
        }
    }
}
