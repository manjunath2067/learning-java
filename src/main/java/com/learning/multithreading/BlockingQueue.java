package com.learning.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {

    private Queue<Integer> q;
    private int capacity;

    public BlockingQueue(int cap) {
        q = new LinkedList<>();
        capacity = cap;
    }

    //producer consumer problem
    public boolean add(int item) throws InterruptedException {
        synchronized (q) {
            while (q.size() == capacity){
                q.wait();
            }
            q.add(item);
            System.out.println(q);
            q.notifyAll(); // notify all the threads whoever are waiting
            return true;
        }
    }

    public int remove() throws InterruptedException {
        synchronized (q) {
            while (q.size() == 0){
                q.wait();
            }
            int element = q.poll();
            System.out.println(q);
            q.notifyAll();
            return element;
        }
    }

}
