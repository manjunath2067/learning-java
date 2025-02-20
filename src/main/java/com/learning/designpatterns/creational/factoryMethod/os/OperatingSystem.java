package com.learning.designpatterns.creational.factoryMethod.os;

public interface OperatingSystem {
    //The client interacts with the OperatingSystem interface rather than the specific WindowsOS or LinuxOS classes.
    void boot();

}
