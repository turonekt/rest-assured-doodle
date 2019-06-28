package com.kainos.java.training.exeptions;

public class Personaa {
    private String name;
    private int yearOfBirth;

    public Personaa(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    static int calculateAgeOfPersonInGivenYear(Personaa personaa, int givenYear) throws Exception {
        int age = givenYear - personaa.yearOfBirth;

        if (age<0){
            throw new Exception("Cannot calculate age");
        }
        return age;
    }

    public static void main(String[] args) {
        Personaa jack = new Personaa("Jack", 1945);
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
