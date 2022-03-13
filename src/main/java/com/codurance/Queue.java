package com.codurance;

public class Queue {

    private int number;
    private int size;
    private int[] elements = new int[2];
    int front;
    int back;

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int element) {
        size++;
        elements[back++ % elements.length] = element;
    }

    public int remove() {
        requireNotEmpty();
        --size;
        return elements[front++ % elements.length];
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
