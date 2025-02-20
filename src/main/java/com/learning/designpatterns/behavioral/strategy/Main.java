package com.learning.designpatterns.behavioral.strategy;

import com.learning.designpatterns.behavioral.strategy.stategies.CreditCardStrategy;
import com.learning.designpatterns.behavioral.strategy.stategies.PayPalStrategy;

public class Main {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("Apple", 40);
        Item item2 = new Item("Banana", 30);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new CreditCardStrategy("1234","Manju","786","12/15"));

//        cart.pay(new PayPalStrategy("myemail@example.com", "mypassword"));

        // Bridge and this. are similar structure. Indeed, all of these patterns are based on composition, which is delegating work to other objects.

        /**
         * Notes:
         *  Define a family of algorithms, encapsulate each one, and make them interchangeable.
         *
         * When to use:
         * 1. When u have multiple algorithms for a specific task, and want to switch between them easily
         * 2. When you want to avoid using conditional statements to choose different behaviors.
         *
         *  In the ShoppingCart example, different payment methods (CreditCardStrategy, PayPalStrategy)
         *  are different algorithms for the same task: processing a payment. The ShoppingCart class doesn't need to know
         *  how each payment method works; it just needs to use the provided PaymentStrategy to process the payment.
         *
         *  2. for second thing, it becomes harder to extend the condition if more payment method comes
         *  it simply adds on the condition like this
         *      if (paymentMethod.equals("creditCard")) {
         *       //
         *       }else if{"paypal"
         *       //
         *       }
         *       else{" other "}
         *       }
         *
         *
         *       which violates the Open/Closed Principle.
         *
         *
         */
    }

}
















/*
       Structure:
        1. Strategy: Encapsulates interchangeable algorithms within different strategy classes that implement a common interface.
        2. Bridge: Splits a class into two separate hierarchies, one for the abstraction and one for the implementation.

        Usage:
        1. Strategy: Used when you need to switch between different algorithms dynamically at runtime.
        2. Bridge: Used when you need to separate an abstraction from its implementation so both can be modified independently.
 */
