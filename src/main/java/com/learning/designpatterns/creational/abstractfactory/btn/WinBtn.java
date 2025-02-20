package com.learning.designpatterns.creational.abstractfactory.btn;

public class WinBtn implements Button {

    @Override
    public void paint() {
        System.out.println("Win Button");
    }
}
