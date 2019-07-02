package com.kainos.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,4,5,10,20));
        displayEvenNumbers(numbers);
        displayNumbersWithEvenIndex(numbers);
    }

    private static void displayNumbersWithEvenIndex(List<Integer> numbers) {
        System.out.println("Even index numbers:");
        for (int i=0; i<numbers.size(); i++){
            if (i%2==0){
                System.out.println(numbers.get(i));
            }
        }
    }

    private static void displayEvenNumbers(List<Integer> numbers) {
        System.out.println("Even numbers:");
        for (Integer number:numbers){
            if (number%2==0){
                System.out.println(number);
            }
        }
    }
}
