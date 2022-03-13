package com.codurance;

public class Queue {

    private boolean isEmpty = true;
    private int number;
    private int size;

    public boolean isEmpty() {
        return isEmpty;
    }

    public void add(int element) {
        size++;
        number = element;
        isEmpty = false;
    }

    public int remove() {
        --size;
        isEmpty = true;
        return number;
    }

    public int size() {
        return size;
    }
}
