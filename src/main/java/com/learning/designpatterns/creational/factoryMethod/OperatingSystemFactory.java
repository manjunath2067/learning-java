package com.learning.designpatterns.creational.factoryMethod;

import com.learning.designpatterns.creational.factoryMethod.os.LinuxOS;
import com.learning.designpatterns.creational.factoryMethod.os.OperatingSystem;
import com.learning.designpatterns.creational.factoryMethod.os.WindowsOS;

//factory class
public class OperatingSystemFactory {

    // this createOS encapsulates creation logic, Main may not need to know details of object creation
    public OperatingSystem createOS(String type) {
        return switch (type.toLowerCase()) {
            case "windows" -> new WindowsOS();
            case "linux" -> new LinuxOS();
            default -> throw new IllegalArgumentException("Unknown OS type");
        };
    }
}
