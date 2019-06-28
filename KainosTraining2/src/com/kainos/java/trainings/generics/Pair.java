package com.kainos.java.trainings.generics;

public class Pair <T extends Person> {
    private T left;
    private T right;

    public Pair(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }

    @Override
    public String toString() {
        return String.format("[%s : %s]", left, right);
    }

    public void changeSeats() {
        T temp = left;
        left = right;
        right = temp;
    }

    public void breakUp(T t) {
        if (t.getGender()==left.getGender()){
            left = t;
        }else{
            right = t;
        }
    }
}
