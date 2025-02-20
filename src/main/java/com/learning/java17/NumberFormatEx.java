package com.learning.java17;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatEx {

    public static void main(String[] args) {
        NumberFormat longFormat = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.LONG);
        NumberFormat shortFormat = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.SHORT);
        System.out.println(longFormat.format(1000));
        System.out.println(shortFormat.format(1000));
    }

}
