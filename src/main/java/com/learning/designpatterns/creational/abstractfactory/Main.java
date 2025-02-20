package com.learning.designpatterns.creational.abstractfactory;


import com.learning.designpatterns.creational.abstractfactory.uifactory.WinUIFactory;

public class Main {

    public static void main(String[] args) {

        // when we have abstraction layer on factory design pattern, we use the abstract factory design pattern
        Application application = new Application(new WinUIFactory());
        application.paint();

        // we are not passing any condition, based on object we are passing everything loaded up
    }

    /**
     *
     * Differences
     * 1. Scope: The Factory Method is typically concerned with the creation of one type of product,
     *      whereas the Abstract Factory deals with families of related products.
     */

}
