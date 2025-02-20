package com.learning.designpatterns.structural.facade.subsystems;

public class NotificationSystem {

    public void sendOrderConfirmation(String customerId) {
        System.out.println("Sending order confirmation to customer " + customerId);
    }

}
