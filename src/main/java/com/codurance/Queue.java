package com.codurance;

public class Queue {

    private int size;
    private int[] elements;
    int front;
    int back;

    public static Queue Make(int input) {
        return new Queue(input);
    }

    private Queue(int capacity) {
        this.elements = new int[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int element) {
        size++;
        if (capacityExceeded()) {
            increaseCapacity();
        }
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

    private boolean capacityExceeded() {
        return size > elements.length;
    }

    private void increaseCapacity() {
        int[] newElements = new int[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }
}
