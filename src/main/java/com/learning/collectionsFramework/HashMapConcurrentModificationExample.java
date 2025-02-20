package com.learning.collectionsFramework;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapConcurrentModificationExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        // Iterate over the map and try to modify it
        for (String key : map.keySet()) {
            // Modify the map directly (will cause ConcurrentModificationException)
//            map.put("A",10);
//            map.remove(key); // Remove the current key
//            map.put("C", 4); // Add a new entry
            map.remove(key); // Add a new entry
            map.put("D", 4);

        }

        System.out.println(map);
    }
}
