package com.learning.collectionsFramework;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetExample {

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(); // find the closest matches for specific target

        set.add(5);
        set.add(2);
        set.add(7);
        set.add(3);
        set.add(9);

        for (int i:set) {
            System.out.print(i+",");
        }

        System.out.println();
        System.out.println(set.first());
        System.out.println(set.floor(8));  // returns greatest element in set <= given element
        System.out.println(set.ceiling(8)); // returns least element in set >= given element
//        System.out.println(set.higher(4)); // strictly higher
//        System.out.println(set.lower(4)); // strictly lower
    }
}

