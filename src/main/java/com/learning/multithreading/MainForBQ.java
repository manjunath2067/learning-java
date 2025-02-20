package com.learning.multithreading;

public class MainForBQ {

    public static void main(String[] args) {
        BlockingQueue blockingQueue = new BlockingQueue(5);

        // Producer thread
        Thread producerThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    blockingQueue.add(i);
                    Thread.sleep(1000); // Simulating some work between adds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Consumer thread
        Thread consumerThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    int element = blockingQueue.remove();
                    System.out.println("Removed: " + element);
                    Thread.sleep(1000); // Simulating some work between removes
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producerThread.start();
        consumerThread.start();

        try {
            // Wait for both threads to finish
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

