package com.learning.java17;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = List.of("APPLE", "PEAR", "ORANGE", "AVOCADO", "BANANA", "MANGO", "GRAPES", "CHERRY");

        for (String fruit : fruits) {
            String result = improvedSwitch(fruit);
            System.out.println("Result for " + fruit + ": " + result);
        }
    }

    private static String improvedSwitch(String fruit) {
        return switch (fruit) {
            case "APPLE", "PEAR" -> {
                System.out.println("The given fruit was: " + fruit);
                yield  "Common fruit";
            }
            case "ORANGE", "AVOCADO" ->  "Exotic fruit";
            case "BANANA", "MANGO" ->  "Tropical fruit";
            default -> "Undefined fruit";
        };
    }


    private static String improvedSwitch1(String fruit) {
        String result;
        switch (fruit) {
            case "APPLE":
            case "PEAR":
                System.out.println("The given fruit was: " + fruit);
                result = "Common fruit";
                break;
            case "ORANGE":
            case "AVOCADO":
                result = "Exotic fruit";
                break;
            case "BANANA":
            case "MANGO":
                result = "Tropical fruit";
                break;
            default:
                result = "Undefined fruit";
                break;
        }
        return result;
    }
}


