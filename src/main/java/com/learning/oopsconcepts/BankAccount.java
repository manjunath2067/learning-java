package com.learning.oopsconcepts;

public class BankAccount {
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0; // Initial balance is zero
    }

    // Getter method for account number (no setter as account number should not change)
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

    public double checkBalance() {
        System.out.println("Balance for account " + accountNumber + ": $" + balance);
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor for SavingsAccount
    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber); // Call the constructor of the base class (BankAccount)
        this.interestRate = interestRate;
    }

    // Method to apply interest to the balance
    public void applyInterest() {
        double interestAmount = getBalance() * interestRate / 100;
        deposit(interestAmount);
        System.out.println("Interest applied to account " + getAccountNumber() + ": $" + interestAmount);
    }

    // Override the checkBalance method to include interest information
    @Override
    public double checkBalance() {
        double currentBalance = super.checkBalance(); // Call the overridden method in the base class
        System.out.println("Interest Rate: " + interestRate + "%");
        return currentBalance;
    }
}

