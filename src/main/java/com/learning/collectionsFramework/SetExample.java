package com.learning.collectionsFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        /**
         * HashSet implementation
         */

        // no ordering,

//        List<Integer> list = new ArrayList<>();
//
//
//        list.add(1);
//        list.add(8);
//        list.add(8);
//        list.add(9);
//        list.add(5);
//
//        Set<Integer> s2 = new HashSet<>(list);
//
        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(3);
        s1.remove(2);
////        s1.clear();
//
        System.out.println(s1);
//        System.out.println(s2);
////
//        System.out.println("after retaining");
//
//        s1.retainAll(s2);  // retain the common elements from both sets
////        s2.removeAll(s1);  //   removes the common elements from both sets
//        System.out.println(s1);
////        System.out.println(s2);

//        Set<String> hs =  new HashSet<>();
//        hs.add("Maanju");
//        hs.add("ram");
//        hs.add("kiran");
//
//        System.out.println(hs);'


        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        hashSet.add(1);



        /**
         * LinkedHashSet
         */

        List<StudentMarks> studMarks = new ArrayList<>();
        studMarks.add(new StudentMarks(70,80));
        studMarks.add(new StudentMarks(65,75));
        studMarks.add(new StudentMarks(100,58));
        studMarks.add(new StudentMarks(85,80));
        studMarks.add(new StudentMarks(90,100));

        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(7);
        set.add(7);
        set.add(9);

        Set<StudentMarks> set4 = new HashSet<>(studMarks);


        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(4);
        set1.add(5);

        for (int x : set) {
            System.out.print(x+",");
        }
        System.out.println();

        for (int y : set1) {
            System.out.print(y+",");
        }

        System.out.println();
        System.out.println(set1.contains(3));

        /*
        Always override equals() and hashCode() of your custom class before using it in hashset
        otherwise contains method will fail.
         */

        System.out.println(set4.contains(new StudentMarks(70,80)));

        /*
         * For this above line, it will print true if we have enabled the hashcode() and equals()
         * in StudentMarks otherwise it returns false
         *
         * Set will go for right bucket and traverse through bucket and one node will tell it as it contains the value. returns true
         */



    }

}
