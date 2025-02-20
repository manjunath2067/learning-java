package com.learning.multithreading;

import javax.swing.plaf.TableHeaderUI;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main is starting");

//        Thread thread1 = new Thread1("thread1");
//        thread1.setDaemon(true);
//        thread1.start();

//        Thread thread2 = new Thread(() -> {
//            for (int i = 0; i < 4; i++)
//                System.out.println(Thread.currentThread()+","+i);
//        }, "thread2");
//        thread2.start();

        //Race condition
//        Stack stack = new Stack(5);
//
//        new Thread(() -> {
//            int counter = 0;
//            while (++counter < 10) {
//                System.out.println("Pushed:" + stack.push(100));
//            }
//        }, "Pusher").start();
//
//        new Thread(() -> {
//            int counter = 0;
//            while (++counter < 10) {
//                System.out.println("Popped" + stack.pop());
//            }
//
//        }, "Popper").start();

        //Thread States and transition
//        Thread thread3 = new Thread(()->{
//            try {
//                Thread.sleep(1);
//                for (int i=0; i<10;i++);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        },"States");
//
//        thread3.start();
//
//
//        while (true){
//            thread3.yield();
//            Thread.State state = thread3.getState();
//            System.out.println(state);
//            if(state == Thread.State.TERMINATED)
//                break;
//        }

        // Thread Join
//        Thread thread = new Thread(()->{
//            System.out.println(Thread.currentThread());
//        },"Our Thread");
//
//        thread.start();
//
////        thread.join();
//        System.out.println("Exiting the main");

        //Creating Deadlock

        String lock1 = "manju";
        String lock2 = "nath";

        Thread thread4 = new Thread(() -> {
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



        Thread thread3 = new Thread(() -> {
            synchronized (lock2) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1) {
                    System.out.println("3 thread, lock acquired");
                }
            }

        }, "thread2");

        thread3.start();
        thread4.start();

    }

}
