package com.learning.java17;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatterExample {
    public static void main(String[] args) {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("B");
        
        System.out.println(timeFormatter.format(LocalTime.of(8, 0)));
        System.out.println(timeFormatter.format(LocalTime.of(13, 0)));
        System.out.println(timeFormatter.format(LocalTime.of(20, 0)));
        System.out.println(timeFormatter.format(LocalTime.of(23, 0)));
        System.out.println(timeFormatter.format(LocalTime.of(0, 0)));
    }
}
