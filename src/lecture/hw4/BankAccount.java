package hw4;

public class BankAccount {

    private double balance;

    public BankAccount() {
        this(0);
    }


    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }


    public void deposit(double amount) {
        balance = balance + amount;
    }


    public void withdraw(double amount) {
        if (balance < amount)
            throw new IllegalArgumentException("Balance must be > amount");
        balance = balance - amount;
    }


    public double getBalance() {
        return balance;
    }



    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}

