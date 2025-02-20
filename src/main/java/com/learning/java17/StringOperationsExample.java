package com.learning.java17;

import org.apache.commons.lang3.StringUtils;

public class StringOperationsExample {
    public  static void main(String[] args) {
        // com.learning.java17.Example string
        String text = "   Hello, World!   ";

        String asd = null;

        // Using isBlank()
        System.out.println("isBlank() result: " + text.isBlank());

        // Using repeat()
        String repeatedText = "*".repeat(5);
        System.out.println("Repeat '*' 5 times: " + repeatedText);

        // Using strip()
        String strippedText = text.strip();
        System.out.println("Stripped text: '" + strippedText + "'");

        // Using indent()
        String indentedText = "Indented text".indent(4);
        System.out.println("Indented text:\n" + indentedText);

        // Using lines()
        String multiLineText = "Line 1\nLine 2\nLine 3";
        multiLineText.lines().forEach(line -> System.out.println("Line: " + line));

        // Using transform()
        String transformedText = text.transform(String::toUpperCase);
        System.out.println("Transformed text to uppercase: " + transformedText);
    }
}
