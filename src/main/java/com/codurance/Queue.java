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
        if (size < 1) {
            throw new UnderflowException();
        }
        --size;
        isEmpty = true;
        return number;
    }

    public int size() {
        return size;
    }
}
