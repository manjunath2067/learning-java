package com.learning.codePractice.functinalIterface;

@FunctionalInterface
public interface UPIPayment    {  //extends TestInterface

    public String doPayment(String source, String dest);

    default void doCheckout(Integer cash){
        int moneyCash = cash;
    }
}
