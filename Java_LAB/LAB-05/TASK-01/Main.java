package project1;

class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    static String bankName = "Sonali Bank";

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    static void showBankName() {
        System.out.println("Bank: " + bankName);
    }

    void displayAccountInfo() {
        System.out.println("Account: " + accountNumber + " | Name: " + accountHolderName + " | Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount.showBankName();

        BankAccount acc1 = new BankAccount("101", "Joydeb", 5000);
        BankAccount acc2 = new BankAccount("102", "Bijoy", 7000);

        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
    }
}
