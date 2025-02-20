package com.learning.designpatterns.structural.bridgePattern.abstraction;

import com.learning.designpatterns.structural.bridgePattern.implementor.Workshop;

public abstract class Vehicle {
    protected Workshop workshop1;
    protected Workshop workshop2;

    protected Vehicle(
          Workshop workshop1,
          Workshop workshop2
    )
    {
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }

    public abstract void manufacture();
    //by making manufacture as abstract, subclasses of Vehicle can provide their own impl. of this method. ex. bike, bus
}
