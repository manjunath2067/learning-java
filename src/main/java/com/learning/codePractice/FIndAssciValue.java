package com.learning.codePractice;

import java.util.Scanner;

public class FIndAssciValue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in character");
        char value = sc.next().charAt(2);

        int convertValue = value;

        System.out.println(convertValue);


    }

}
