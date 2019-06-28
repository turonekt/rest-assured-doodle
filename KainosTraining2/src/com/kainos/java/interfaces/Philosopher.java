package com.kainos.java.interfaces;

public class Philosopher implements Talkable {

    @Override
    public String think() {
        return "I think therefore I am";
    }
}
