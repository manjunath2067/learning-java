package com.learning.codePractice;

class SharedData {
//    volatile
    boolean flag = false;

    void setFlag() {
        System.out.println("Setting flag to true");
        flag = true;
    }

    void checkFlag() {
        while (!flag) {
            // Waiting for flag to change
        }
        System.out.println("Flag changed!");
    }
}

public class Main {
    public static void main(String[] args) {
        SharedData data = new SharedData();

        Thread writer = new Thread(data::setFlag);
        Thread reader = new Thread(data::checkFlag);

        reader.start();
        writer.start();
    }
}
