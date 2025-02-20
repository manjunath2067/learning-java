package com.learning.codePractice.functinalIterface;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestFunInterExamples {
    public static void main(String[] args) {
        Function<String, Integer> length = s-> s.length();
        System.out.println(length.apply("manjunath"));

        List<String> names = Arrays.asList("Manju","hello");
        Consumer<String> printName = name-> System.out.println(name);
        names.forEach(printName);

        //Filtering with Predicate:
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> even = numbers.stream().filter(n-> n % 2 == 0).toList();
        System.out.println(even);

        //Transforming with Function
        List<String> names1 = Arrays.asList("Manju","sham","ram");
        List<Integer> var = names1.stream().map( n -> n.length()).collect(Collectors.toList());
        System.out.println(var);

        //Consuming with Consumer:
        names1.forEach(name -> System.out.println("Hello: "+name));

        //calling interface from class

//        TestInterface test = (i)-> System.out.println("test method implemented");
//        test.test(52);

//        TestInterface number = (i) -> i*10;
//        System.out.println(number.make(15));

        TestInterface stringsss = (s,s2) -> s+s2;
        System.out.println(stringsss.maker("manju", "nath"));

        List<Integer> four = Arrays.asList(1,34,21,5,7,55,7,78);
        List<Integer> out = four.stream().filter(f->f>4).toList();
        System.out.println(out);
    }


}
