package com.learning.collectionsFramework;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        
        // Adding elements
        treeSet.add("a");
        treeSet.add("z");
        treeSet.add("r");
        treeSet.add("f");
        
        // Display the TreeSet
        System.out.println(treeSet); // Output: [1, 3, 5, 10]
        
        // NavigableSet methods
        System.out.println(treeSet.lower("b")); // Output: 3
        System.out.println(treeSet.floor("c")); // Output: 5
        System.out.println(treeSet.ceiling("y")); // Output: 5
        System.out.println(treeSet.higher("r")); // Output: 10
    }
}
