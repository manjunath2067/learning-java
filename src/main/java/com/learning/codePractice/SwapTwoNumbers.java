package com.learning.codePractice;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

    }

}
