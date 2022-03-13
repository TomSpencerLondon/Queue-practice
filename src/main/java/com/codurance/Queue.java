package com.codurance;

public class Queue {

    private int number;
    private int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int element) {
        size++;
        number = element;
    }

    public int remove() {
        requireNotEmpty();
        --size;
        return number;
    }

    public int size() {
        return size;
    }

    private void requireNotEmpty() {
        if (size < 1) {
            throw new UnderflowException();
        }
    }
}
