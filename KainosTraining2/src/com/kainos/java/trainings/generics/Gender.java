package com.kainos.java.trainings.generics;

public enum Gender {
    MALE("man"),
    FEMALE("woman"),
    OTHER("unknown");

    private final String name;

    Gender(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
