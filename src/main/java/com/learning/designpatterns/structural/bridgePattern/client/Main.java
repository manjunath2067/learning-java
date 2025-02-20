package com.learning.designpatterns.structural.bridgePattern.client;

import com.learning.designpatterns.structural.bridgePattern.abstraction.Bike;
import com.learning.designpatterns.structural.bridgePattern.abstraction.Bus;
import com.learning.designpatterns.structural.bridgePattern.abstraction.Vehicle;
import com.learning.designpatterns.structural.bridgePattern.implementor.Assemble;
import com.learning.designpatterns.structural.bridgePattern.implementor.Produce;

public class Main {

    public static void main(String[] args) {

        Vehicle bus = new Bus(new Assemble(), new Produce());
        bus.manufacture();

        Vehicle bike = new Bike(new Assemble(), new Produce());
        bike.manufacture();


        /**
         * Bridge:
         *  Bridge pattern decouples an ABSTRACTION from its implementation so two can vary independently
         *
         *  1. It can grow at the abstraction side, implementor remains the same, basically it can vary from its abstraction
         *  2. so bridge we can say for the, connection between abstraction and implementor
         *
         */
    }

}
