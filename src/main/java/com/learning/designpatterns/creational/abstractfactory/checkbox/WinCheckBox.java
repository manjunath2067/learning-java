package com.learning.designpatterns.creational.abstractfactory.checkbox;

public class WinCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("Win checkBox");
    }
}
