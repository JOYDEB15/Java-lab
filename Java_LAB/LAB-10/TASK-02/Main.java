package project1;

interface ATMService {
    void withdraw(double amount);
    void deposit(double amount);
    void checkBalance();
}

class DBBL implements ATMService {
    double balance = 5000;

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful: " + amount);
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        DBBL account = new DBBL();
        account.deposit(2000);
        account.withdraw(1000);
        account.checkBalance();
    }
}
