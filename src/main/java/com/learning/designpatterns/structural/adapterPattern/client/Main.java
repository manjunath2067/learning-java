package com.learning.designpatterns.structural.adapterPattern.client;

import com.learning.designpatterns.structural.adapterPattern.adaptee.WeightMachineForFemale;
import com.learning.designpatterns.structural.adapterPattern.adaptee.WeightMachineForMale;
import com.learning.designpatterns.structural.adapterPattern.adapter.WeightAdapter;
import com.learning.designpatterns.structural.adapterPattern.adapter.WeightAdapterImpl;

public class Main {

    public static void main(String[] args) {

        WeightAdapter weightAdapter = new WeightAdapterImpl(new WeightMachineForMale());

        WeightAdapter weightAdapterForFemale = new WeightAdapterImpl(new WeightMachineForFemale());

        System.out.println(weightAdapter.getWeightInKg()+"Kg");
        System.out.println(weightAdapterForFemale.getWeightInKg()+"Kg");





        /**
         *
         * Structural: clubbing together 2 or more to solve one bigger problem
         *
         * Usage:
         *  The Adapter Pattern is useful in scenarios where existing interfaces
         *   need to be adapted to meet new requirements or integrate with existing systems
         *
         * OOPS:
         * 1. it encapsulates the conversion within adapter, client np need to know about the business logic.
         */
    }

}
