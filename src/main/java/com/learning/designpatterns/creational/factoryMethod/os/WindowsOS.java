package com.learning.designpatterns.creational.factoryMethod.os;

public class WindowsOS implements OperatingSystem {

    @Override
    public void boot() {
        System.out.println("Windows is booting..");
    }
}
