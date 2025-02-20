package com.learning.multithreading;

public class Stack {

    private int[] array;
    private int stackTop;
    Object lock;

    public Stack(int capacity) {
        array = new int[capacity];
        stackTop = -1;
        lock = new Object();
    }

    public boolean isEmpty() {
        return stackTop < 0;
    }

    public boolean isFull() {
        return stackTop >= array.length - 1;
    }


    //This class is definitely not a thread safe

    //lets we have 3 threads t1 , t2 , t3
    // here if t2 gets the push lock, it gets access to method, in mean time t1 is waiting for this lock, but t1
    //can't go and access the pop method bcz these 2 synchronised methods are bounded by same lock object,
    // so whichever thread gets access to this lock, it will only access the other methods.
    public boolean push(int element) {
        synchronized (lock){
        if (isFull()) return false;
        ++stackTop;

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        array[stackTop] = element;
        return true;
    }}


    //t1, t4, t5
    public int pop() {
        synchronized (lock){
            if (isEmpty()) return Integer.MIN_VALUE;
            int obj = array[stackTop];
            array[stackTop] = Integer.MIN_VALUE;

            try {
                Thread.sleep(1000);
            } catch (Exception e) { }
            stackTop--;
            return obj;
        }
    }
}
