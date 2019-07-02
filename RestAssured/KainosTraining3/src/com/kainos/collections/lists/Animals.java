package com.kainos.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Animals {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(Arrays.asList("dog", "cat", "parrot", "bear", "whale"));
        System.out.println(animals);
        System.out.println(" ");
        addElement(animals);
        setNewIndex(animals);
        displayIndex(animals);
        displayLastIndexOf(animals);
        removeElement(animals);
        removeElementByIndex(animals);
        displayDuplicateElements(animals);
    }

    private static void displayDuplicateElements(List<String> animals) {
        System.out.println("Is bear duplicated?");
        System.out.println("probably");


    }

    private static void removeElementByIndex(List<String> animals) {
        System.out.println("Remove first bear by index");
        animals.remove(0);

        System.out.println(animals);
        System.out.println(" ");
    }

    private static void removeElement(List<String> animals) {
        System.out.println("Remove 'parrot'");
        animals.remove("parrot");

        System.out.println(animals);
        System.out.println(" ");
    }

    private static void displayLastIndexOf(List<String> animals) {
        System.out.println("Last index of last 'bear'");

        System.out.println(animals.lastIndexOf("bear"));
        System.out.println(" ");

    }

    private static void displayIndex(List<String> animals) {
        System.out.println("Returning index of first bear");

        System.out.println(animals.indexOf("bear"));
        System.out.println(" ");
    }

    private static void setNewIndex(List<String> animals) {
        System.out.println("Set bear as first");
        animals.set(0, "bear");
        System.out.println(animals);
        System.out.println(" ");
    }


    private static void addElement(List<String> animals) {
        System.out.println("Adding second 'bear'");

        animals.add("bear");

        System.out.println(animals);
        System.out.println(" ");
    }
}
