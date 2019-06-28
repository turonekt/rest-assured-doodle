package com.kainos.java.training.exeptions;

public class Person {
    private String name;
    private int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    static int calculateAgeOfPersonInGivenYear(Person person, int givenYear) throws Exception {
        int age = givenYear - person.yearOfBirth;

        if (age<0){
            throw new Exception("Cannot calculate age");
        }
        return age;
    }

    public static void main(String[] args) {
        Person jack = new Person("Jack", 1945);
        try {
            System.out.println(calculateAgeOfPersonInGivenYear(jack, 2019));
        } catch (Exception e) {
            System.out.println((e.getMessage()));
        }
        finally {
            System.out.println("111");
        }
        System.out.println("test");
    }
}
