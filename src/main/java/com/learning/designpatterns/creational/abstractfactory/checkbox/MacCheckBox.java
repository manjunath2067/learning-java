package com.learning.designpatterns.creational.abstractfactory.checkbox;

public class MacCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("Mac checkBox");
    }
}
