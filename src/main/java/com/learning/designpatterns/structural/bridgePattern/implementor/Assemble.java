package com.learning.designpatterns.structural.bridgePattern.implementor;

public class Assemble implements Workshop{

    @Override
    public void work() {
        System.out.println("Assembling vehicle");
    }
}
