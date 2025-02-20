package com.learning.multithreading;

public class DeadlockExample {
    public static void main(String[] args) {
        String lock1 = "manju";
        String lock2 = "nath";
        System.out.println("Main started");

        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2) {
                    System.out.println("Lock acquired");
                }
            }
        }, "thread1");

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) { // Second lock acquired first in thread2
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1) {
                    System.out.println("Second lock acquired");
                }
            }
        }, "thread2");

        thread1.start();
        thread2.start();
    }
}

/*
 * thread1 starts and attempts to acquire lock1.
 * Meanwhile, thread2 starts and attempts to acquire lock2 first.
 * thread1 successfully acquires lock1.
 * thread2 successfully acquires lock2.
 * Now, thread1 tries to acquire lock2, but it's held by thread2.
 * Similarly, thread2 tries to acquire lock1, but it's held by thread1.
 *
 * Both threads are now waiting for each other to release the locks they hold, resulting in a deadlock scenario.
 */