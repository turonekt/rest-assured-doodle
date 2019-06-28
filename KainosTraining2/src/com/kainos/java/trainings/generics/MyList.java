package com.kainos.java.trainings.generics;

public class MyList <T> {
    private T[] items;
    private int maxSize;
    public MyList(int size) {
        items = (T[]) new Object[size];
        maxSize = size;
    }
}