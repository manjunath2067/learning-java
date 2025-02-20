package com.learning.codePractice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Filter;

import javax.crypto.spec.PSource;

import org.example.FileCopyExample;

public class TestStreamClass {

    public static void main(String[] args) {

        //Filter and Collect
        List<String> names = Arrays.asList("Manju","sham","ram");

        List<String> filter = names.stream().filter(n-> n.startsWith("M")).toList();
        System.out.println(filter);

        //sum of even numbers

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        int filter1 = numbers.stream().filter(n->n%2 == 0).mapToInt(n->n).sum();
        System.out.println(filter1);

        //convert string to uppercase
        List<String> upper = names.stream().map(n->n.toUpperCase()).toList();
        System.out.println(upper);

    }





}
