package com.learning.java17;

public class Example {
    static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Person person = null; // Assigning null to person
        String name = person.getName(); // Attempting to call a method on null reference
        System.out.println("Name: " + name);
        //edit1
    }
}
