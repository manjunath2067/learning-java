package com.learning.collectionsFramework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueueExample {

    public static void main(String[] args) {

        // FIFO queue, if you want to use queue , then use LinkedList
//        Queue<Integer> q= new LinkedList<>();
//        q.offer(1);   //IllegalStateException
//        q.offer(2);
//        q.offer(3);
//
//        System.out.println(q.peek());  // retrieves but not removes
//        System.out.println(q.poll());
//        System.out.println(q.poll());
//        q.offer(4);
//        System.out.println(q.poll());
//        System.out.println(q.peek());
//        System.out.println(q.isEmpty());


//        // stack LIFO ,  if u want to use stack, use Stack class in java
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//        while (!stack.isEmpty()) {
//            System.out.println(stack.peek());
//            stack.pop();
//        }
//
//        //ArrayDeque
//        Deque<Integer> deque =  new ArrayDeque<>();
//        deque.offer(1);
//        deque.offer(2);
//        deque.offer(3);
//        deque.offer(4);
//        deque.offerLast(7);
//        deque.offerFirst(4);
//
//        System.out.println(deque);
//
//        deque.pollFirst();
//        System.out.println(deque);
//        deque.pollLast();
//        System.out.println(deque);
//
//        //Priority Queue
//
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(9);
////        System.out.println(pq.poll());
////        System.out.println(pq.remove());
//
//        pq.offer(4);
//        pq.offer(2);
//        pq.offer(8);
//        pq.offer(24);
//        System.out.println(pq);
//
        List<Integer> top2 = new ArrayList<>();
//        int index =0;
//        while (!pq.isEmpty()){
//            if (index == 2 )
//                break;
//            top2.add(pq.poll());
//            index ++;
//
//        }
////
//        System.out.println(top2);
//        System.out.println(pq);
//
//       here we were not getting error bcz Integer implements comparable
//
//        /** get me top 3 students according to their maths marks **/
//
//        List<StudentMarks> studentMarks = new ArrayList<>();
//        studentMarks.add(new StudentMarks(70,80));
//        studentMarks.add(new StudentMarks(65,75));
//        studentMarks.add(new StudentMarks(100,58));
//        studentMarks.add(new StudentMarks(85,80));
//        studentMarks.add(new StudentMarks(90,100));
////
////
//        PriorityQueue<StudentMarks> pq1 = new PriorityQueue<>(studentMarks);
//
//        List<StudentMarks> top3 = new ArrayList<>();
//        int index =0;
//        while (!pq1.isEmpty()){
//            if (index==3)
//                break;
//            top3.add(pq1.poll());
//            index ++;
//        }
//
//        System.out.println(top3);
//        System.out.println(pq1);
//
//        /*
//        when you want to use the custom class with Priority queue you can use comparable interface. otherwise it will give error
//         */
//
//
//        /** what if we want the top2 form the bottom 2, bcz comparable gives only natural ordering
//         * But using comparator we have higher precedence for total ordering
//         * Total ordering >> natural ordering**/
//
//
//        PriorityQueue<Integer> pq2 = new PriorityQueue<>(new MyCustomComparator());

        /*
            The above line can also be achieved using lambda, we dont need custom class and all
         */
//        PriorityQueue<Integer> pq2 = new PriorityQueue<>((a,b) ->b-a);
//
//        pq2.offer(4);
//        pq2.offer(2);
//        pq2.offer(7);
//        pq2.offer(6);
//        pq2.offer(9);
//        System.out.println(pq2);
//
//        //top 2 elements
//        List<Integer> bottom2= new ArrayList<>();
//        int index=0;
//        while (!pq2.isEmpty()){
//            if (index == 2)
//                break;
//            bottom2.add(pq2.poll());
//            index++;
//        }
//        System.out.println(bottom2);
//        System.out.println(pq2);
//
//        /**
//         * get top 3 student from physics, with lambda
//         */
//
        List<StudentMarks> studMarks = new ArrayList<>();
        studMarks.add(new StudentMarks(70,80));
        studMarks.add(new StudentMarks(65,75));
        studMarks.add(new StudentMarks(100,58));
        studMarks.add(new StudentMarks(85,80));
        studMarks.add(new StudentMarks(90,100));


        PriorityQueue<StudentMarks> pq44 = new PriorityQueue<>( (s1, s2) ->
        {
            System.out.println("Comparator compare() method called");
            return s2.physics() - s1.physics();
        });


        pq44.addAll(studMarks);

        List<StudentMarks> top4 = new ArrayList<>();
        int index =0;
        while (!pq44.isEmpty()){
            if (index==3)
                break;
            top4.add(pq44.poll());
            index ++;
        }

        System.out.println(top4);
        System.out.println(pq44);

    }

}
