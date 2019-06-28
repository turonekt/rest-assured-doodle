package com.kainos.java.trainings.generics;

public class Person {
    private final String name;
    private final int yearOfBirth;
    private final Gender gender;

    private final static int actualYear = 2019;

    public Person(String name, int yearOfBirth, Gender gender) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("%s %d yrs old - %s", name, (actualYear-yearOfBirth), gender);
    }

    public Gender getGender() {
        return this.gender;
    }
}
