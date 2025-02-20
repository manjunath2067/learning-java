package com.learning.designpatterns.structural.adapterPattern.adapter;

import com.learning.designpatterns.structural.adapterPattern.adaptee.WeightMachine;

public class WeightAdapterImpl implements WeightAdapter{

    WeightMachine weightMachine;

    public WeightAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {

        double weightInPound = weightMachine.getWeightInPound();

        double weightInKg = weightInPound * 0.45;
        return weightInKg;
    }
}
