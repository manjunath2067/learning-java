package com.learning.designpatterns.structural.facade;

import com.learning.designpatterns.structural.facade.subsystems.InventorySystem;
import com.learning.designpatterns.structural.facade.subsystems.NotificationSystem;
import com.learning.designpatterns.structural.facade.subsystems.PaymentSystem;
import com.learning.designpatterns.structural.facade.subsystems.ShippingSystem;

public class OrderFacade {

    private InventorySystem inventorySystem;
    private NotificationSystem notificationSystem;
    private PaymentSystem paymentSystem;
    private ShippingSystem shippingSystem;

    public OrderFacade() {
        this.inventorySystem = new InventorySystem();
        this.paymentSystem = new PaymentSystem();
        this.shippingSystem = new ShippingSystem();
        this.notificationSystem = new NotificationSystem();
    }

    public void placeOrder(
          String productId,
          String customerId,
          double amount
    )
    {
        if (inventorySystem.checkStock(productId)) {
            if (paymentSystem.processPayment(customerId, amount)) {
                shippingSystem.arrangeShipping(productId, customerId);
                notificationSystem.sendOrderConfirmation(customerId);
                System.out.println("Order placed successfully");
            } else {
                System.out.println("Payment failed");
            }
        } else {
            System.out.println("Product not available");
        }
    }

}
