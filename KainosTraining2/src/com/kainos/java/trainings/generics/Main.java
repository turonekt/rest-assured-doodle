package com.kainos.java.trainings.generics;

import org.omg.CORBA.UNKNOWN;

public class Main {
    public static void main(String[] args){
        Person eva = new Person("Eva", 1899, Gender.FEMALE);
        Person john = new Person("John", 1895, Gender.MALE);
        Student tom = new Student("Tom", 1897, Gender.MALE);

        Pair<Person> pair = new Pair<>(eva, tom);
        System.out.println(pair);
        pair.changeSeats();
        System.out.println(pair);

        pair.breakUp(john);
        System.out.println(pair);

    }
}
