package com.learning.oopsconcepts;

public class Main {
    public static void main(String[] args) {
        // Creating a regular BankAccount
        BankAccount regularAccount = new BankAccount("123456789");

        // Performing transactions on the regular account
        regularAccount.deposit(1000.0);
        regularAccount.checkBalance();
        regularAccount.withdraw(500.0);
        regularAccount.checkBalance();

        // Creating a SavingsAccount with interest rate
        SavingsAccount savingsAccount = new SavingsAccount("987654321", 3.5);

        System.out.println("----------------------------------");

        // Performing transactions on the savings account
        savingsAccount.deposit(2000.0);
        savingsAccount.checkBalance();
        savingsAccount.applyInterest();
        savingsAccount.checkBalance();

    }
}
