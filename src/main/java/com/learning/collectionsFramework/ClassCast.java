package com.learning.collectionsFramework;

import java.util.Set;
import java.util.TreeSet;

public class ClassCast {

    public static void main(String[] args) {
        new ClassCast().go();
    }

    public void go(){

        Book b1 = new Book("Cat");
        Book b2 = new Book("Dog");
        Book b3 = new Book("Horse");

        Set<Book> tree = new TreeSet<>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);

        System.out.println(tree);
    }

}

class Book implements Comparable{
    private String title;

    String getTitle() {
        return title;
    }

    public Book(String t){
        title = t;
    }

    @Override
    public String toString() {
        return "Book{" +
              "title='" + title + '\'' +
              '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
