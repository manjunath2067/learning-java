package com.learning.designpatterns.structural.facade.subsystems;

public class ShippingSystem {

    public void arrangeShipping(String productId, String customerId){
        System.out.println("Arranging shipping for product: " + productId + " to customer: " + customerId);
    }

}
