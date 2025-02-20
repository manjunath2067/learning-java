package com.learning.designpatterns.creational.abstractfactory.btn;

public class MacBtn implements Button {

    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
