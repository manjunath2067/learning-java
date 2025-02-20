package com.learning.designpatterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

import com.learning.designpatterns.behavioral.strategy.stategies.PaymentStrategy;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item: items){
            sum+= item.getPrice();
        }
        return sum;
    }

    //ShoppingCart will use the PaymentStrategy interface.
    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }

}
