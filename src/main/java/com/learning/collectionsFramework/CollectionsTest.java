package com.learning.collectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionsTest {

    public static void main(String[] args) {

        OurGenericList<Integer> list = new OurGenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        for (Object i: list){
//            System.out.println(i); // this foreach loop does the above 3 lines
//        }
//
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        for (int y : list1) {
            System.out.println(y);
        }

//        //ArrayList
//        List<Integer> alist = new ArrayList<>();
//        alist.add(7);
//        alist.add(8);
//        alist.add(9);
//
//        System.out.println(alist.size());
//
////        alist.set(1,100);
//
//        System.out.println(alist);
//
//        // conversion form arraylist to array
//        Integer [] arr = alist.toArray(new Integer[0]);
//
//        for (int x : arr) {
//            System.out.print(x+",");
//        }
//
//        List<Integer> list2 = new ArrayList<>(alist);  // create a new list with parameter as another list
//        list2.add(5);
//        System.out.println();
//        System.out.println(list2);
//
//        list2.addAll(1,alist);
//        System.out.println(list2);
//
//        System.out.println(list2.indexOf(5));
//
//        String jobArray[] = {"jack","merray"};  // array
//        List af = Arrays.asList(jobArray);
//        System.out.println(af);
//
//        List<String> stringList = new ArrayList<>();
//
//        Collections.addAll(stringList,jobArray);
//
//        System.out.println(stringList);
//
//        List<Integer> list3 = list2.subList(2,5);  //  2 is inclusive and 5 is exclusive
//        System.out.println(list3);
//
//        list2.set(0,100);   // set the value to particular index
//        System.out.println(list2);
//
//
//
//        // LinkedList with ListIterator
//        List<Integer> l1 = new LinkedList<>();
//        l1.add(1);
//        l1.add(2);
//        l1.add(3);
//        l1.add(4);
//
//        ListIterator<Integer> iterator = l1.listIterator(); // bidirectional iterator for list
//
//        System.out.println(l1);
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());// first return and then increment , after 2 prints, cursor will at 3
//        System.out.println(iterator.previous()); // then gets decrement and prints 2
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.previous()); // first decrement then return,
//        System.out.println(iterator.hasNext());

        //next = return items[index++]
        //previous = return items[--index]












    }

}
