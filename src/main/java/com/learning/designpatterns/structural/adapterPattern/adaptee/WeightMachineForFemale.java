package com.learning.designpatterns.structural.adapterPattern.adaptee;

public class WeightMachineForFemale implements WeightMachine{

    @Override
    public double getWeightInPound() {
        return 100;
    }
}
