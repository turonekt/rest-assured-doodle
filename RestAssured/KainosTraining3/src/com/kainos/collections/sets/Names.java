package com.kainos.collections.sets;

import java.util.*;

public class Names {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>(Arrays.
                asList("John", "Mark", "Jane", "Martha", "Mark", "Olivia", "Olivia"));
        System.out.println(names+"\n");
//        System.out.println(" ");

        for (String name:names){
            System.out.println(name);
        }

        addElement(names);
    }

    private static void addElement(Set<String> names) {
        names.add("Kot");
        System.out.println("\n");
        for (String name:names){
            System.out.println(name);
        }

    }
}
