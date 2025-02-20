package com.learning.designpatterns.creational.factoryMethod;

import com.learning.designpatterns.creational.factoryMethod.os.OperatingSystem;

public class Main {

    public static void main(String[] args) {

        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();

        OperatingSystem windows = operatingSystemFactory.createOS("Windows");
        windows.boot();

        OperatingSystem linux = operatingSystemFactory.createOS("linux");
        linux.boot();

        // in future if I want to just add MAC, just need to create separate class for this
        // Main class remains same.



        /*
        Pros:
        1. we avoid tight coupling between the creator and the concrete products.

        Cons:
        1. code becomes more complicated since it creates a lot of subclasses for implementing this pattern
        2. it will be difficult when u r introducing in existing hierarchy
         */

        /**
         * Notes:
         *
         * Intent: Define an interface for creating an object, but let subclasses alter the type of objects that will be created.
         *
         * when:
         *  1. class cannot predict the type of objects it needs to create.
         *
         *Achieved :
         * 1. encapsulates object creation within single method
         * 2. open/close principle - means new OS can be added without impacting existing implementation
         */
    }

}
