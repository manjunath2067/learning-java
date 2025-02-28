package com.learning.collectionsFramework;

import java.util.Iterator;

public class OurGenericList<T> {

    private T[] items;
    private int size;

    public OurGenericList(){
        size = 0;
        items = (T[]) new Object[100];
    }

    public void add(T item){
        items[size++] = item;
    }

    public T getItemIndex(int index){
        return items[index];
    }

//    @Override
//    public Iterator<T> iterator(){
//        return new OurGenericListIterator(this);
//    }

    private class OurGenericListIterator implements Iterator<T>{

        private OurGenericList<T> list;
        private int index = 0;

        public OurGenericListIterator(OurGenericList<T> list){
            this.list = list;
        }
        @Override
        public boolean hasNext() {
            System.out.println("hasNext called");
            return index < list.size;
        }

        @Override
        public T next() {
            System.out.println("next called");
            return list.items[index ++];

        }

    }
}
