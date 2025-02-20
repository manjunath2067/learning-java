package com.learning.designpatterns.structural.bridgePattern.abstraction;

import com.learning.designpatterns.structural.bridgePattern.implementor.Workshop;

public class Bus extends Vehicle{

    public Bus(Workshop workshop1, Workshop workshop2){
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.print("Bus ");
        workshop1.work();
        workshop2.work();
    }
}
