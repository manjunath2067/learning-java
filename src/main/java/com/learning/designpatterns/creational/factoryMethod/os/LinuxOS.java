package com.learning.designpatterns.creational.factoryMethod.os;

public class LinuxOS implements OperatingSystem {

    @Override
    public void boot() {
        System.out.println("Linux is booting..");
    }
}
