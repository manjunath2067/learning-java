package com.learning.designpatterns.structural.facade.subsystems;

public class PaymentSystem {
    public boolean processPayment(String customerId, double amount) {
        System.out.println("Processing payment for customer: " + customerId + " for amount: " + amount);
        return true;
    }
}
