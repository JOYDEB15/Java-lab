package project1;

class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    String getAccountHolder() {
        return accountHolder;
    }

    int getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountHolder("Joydeb Kumar Nath");
        acc.setAccountNumber(1001);
        acc.setBalance(50000.50);

        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Balance: " + acc.getBalance());
    }
}

