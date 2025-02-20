package com.learning.collectionsFramework;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetComparator {

    public static void main(String[] args) {
        // Custom Comparator to sort strings by their length
        Comparator<String> lengthComparator = new Comparator<String>() {
            @Override
            public int compare(
                  String s1,
                  String s2
            )
            {
                return Integer.compare(s1.length(), s2.length());
            }

        };

        // TreeSet with custom Comparator
        SortedSet<String> sortedSet = new TreeSet<>(lengthComparator);
        sortedSet.add("apple");
        sortedSet.add("banana");
        sortedSet.add("cherry");
        sortedSet.add("date");

        // Output: [date, apple, banana, cherry]
        System.out.println(sortedSet);
    }

}
