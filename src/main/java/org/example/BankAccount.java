package org.example;

//Data Abstraction

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Getter method for account number (no setter as account number should not change)

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from account " + getAccountNumber());
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

    public double checkBalance() {
        System.out.println("Balance for account " + accountNumber + ":" + balance);
        return balance;
    }

    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount myAccount = new BankAccount("123456789");

        // Performing transactions
        myAccount.deposit(1000);
        myAccount.checkBalance();

        myAccount.withdraw(500.0);
        myAccount.checkBalance();
    }
}
