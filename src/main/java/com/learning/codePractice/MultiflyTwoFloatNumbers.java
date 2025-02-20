package com.learning.codePractice;

import java.util.Scanner;

public class MultiflyTwoFloatNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 float numbers");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();

        float num3 = num1 * num2;
        System.out.println(num3);

    }


}
