package com.kainos.java.trainings.collections.sets.maps;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();

        people.put("Mark", 35);
        people.put("Deborah", 20);
        people.put("Selene", 53);
        people.put("Olivia", 21);
        people.put("Connor", 42);

        System.out.println(people+"\n");

        for (String name:people.keySet()){
            System.out.println(name);
            System.out.println(people.get(name));
        }

        for (Integer intiger:people.values()){
            System.out.println(intiger+"\n");
        }


        people.put("Olivia", 100);
        System.out.println(people+"\n");

        for (Map.Entry<String, Integer> person:people.entrySet()){
            System.out.println(String.format("%s lat %d", person.getKey(), person.getValue()));
        }
    }
}
