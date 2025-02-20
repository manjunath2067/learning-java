package com.learning.multithreading;


// we choose Runnable because a class extending thread cannot extend any other class,
// but we can have multiple interfaces for Runnable
public class Thread2 implements Runnable {

    @Override
    public void run(){
        for (int i=0; i<4 ; i++){
            System.out.println("Inside thread 2");
        }
    }

}
