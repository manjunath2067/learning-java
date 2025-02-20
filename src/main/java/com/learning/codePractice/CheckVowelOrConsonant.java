package com.learning.codePractice;

import java.util.Scanner;

public class CheckVowelOrConsonant {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a alphabet");
        char charst = sc.next().charAt(0);

        if (charst == 'a' || charst == 'e' ||charst == 'i'||charst == 'o'||charst =='u'){
            System.out.println("its vowel");
        }
        else {
            System.out.println("its consonant");
        }

    }

}
