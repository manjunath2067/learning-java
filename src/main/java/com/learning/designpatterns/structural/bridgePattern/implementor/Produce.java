package com.learning.designpatterns.structural.bridgePattern.implementor;

public class Produce implements Workshop{

    @Override
    public void work() {
        System.out.println("Producing Vehicle");
    }
}
