package com.learning.designpatterns.structural.facade.client;

import com.learning.designpatterns.structural.facade.OrderFacade;

public class Main {

    public static void main(String[] args) {

        OrderFacade order1 = new OrderFacade();
        order1.placeOrder("P123","C345",999.99);
    }

    /**
     * Notes:
     *      Facade is valuable when dealing with complex systems, as it
     *      1. simplifies interactions
     *      2. reduces dependency
     *      3. enhance code maintainability
     *      4. Unified interface to multiple subsystems
     *
     *
     *
     */

}
