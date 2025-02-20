package com.learning.designpatterns.behavioral.strategy.stategies;

public class CreditCardStrategy implements PaymentStrategy {

    private String cardNumber;
    private String name;
    private String cvv;
    private String expiryDate;

    public CreditCardStrategy(
          String cardNumber,
          String name,
          String cvv,
          String expiryDate
    )
    {
        this.cardNumber = cardNumber;
        this.name = name;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " with credit card");
    }
}
