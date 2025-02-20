package com.learning.collectionsFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapExample extends Thread{

    static Map<Integer, String> map = new HashMap<>(100,0.5f);

    public void run()
    {
        try {
            Thread.sleep(1000);
            map.put(103, "D");
        } catch (InterruptedException e) {
            System.out.println(" add element");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        map.put(100,"A");
        map.put(101,"B");
        map.put(102,"C");

        HashMapExample t= new HashMapExample();
        t.start();

        for (Object o :map.entrySet())
        {
            Object s =o;
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(map);

    }

}
