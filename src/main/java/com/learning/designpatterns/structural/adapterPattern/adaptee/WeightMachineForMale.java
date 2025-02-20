package com.learning.designpatterns.structural.adapterPattern.adaptee;

public class WeightMachineForMale implements WeightMachine{

    @Override
    public double getWeightInPound() {
        return 140;
    }
}
