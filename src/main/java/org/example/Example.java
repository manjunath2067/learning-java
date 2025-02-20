//package org.example;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//import org.apache.commons.lang3.StringUtils;
//import org.apache.commons.lang3.ObjectUtils;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class com.learning.java17.Example {
//    public static void main(String[] args) {
//        Map<String, List<String>> hmap = new HashMap<>();
//        hmap.put("CREATED", null);
//        hmap.put("ERROR", List.of("A", "B"));
//        hmap.put("RUNNING", null);
//        hmap.put("STOPPED", null);
//
//        List<String> keysWithNullValue = hmap.entrySet()
//              .stream()
//              .filter(entry -> StringUtils.isNotBlank(entry.getKey())) // filter by key
//              .filter(entry -> entry.getValue() == null || entry.getValue().isEmpty()) // filter by value
//              .map(Map.Entry::getKey)
//              .collect(Collectors.toList());
//
//        System.out.println("Result: " + keysWithNullValue);
//
//        hmap.keySet().removeAll(keysWithNullValue);
//
//        System.out.println(hmap);
//    }
//}
