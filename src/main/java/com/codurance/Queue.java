package com.codurance;

public class Queue {

    private boolean isEmpty = true;

    public boolean isEmpty() {
        return isEmpty;
    }

    public void add(int element) {
        isEmpty = false;
    }
}
