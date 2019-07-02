package com.kainos.java.trainings.collections.sets.Lottery;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LotteryGame {
    public static void main(String[] args) {
        play();
    }

    public static void play(){
        System.out.println("Hello !");

        Set<Integer> guessedNumbers = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        Integer number;

        while (guessedNumbers.size()<6){
            System.out.println("Please give a number");
            try {
                number = Integer.parseInt(scanner.nextLine());

                if (number >= 1 && number <= 49) {
                    guessedNumbers.add(number);
                }else {
                    System.out.println("Please provide number 1-49");
                }
            }catch (NumberFormatException e){
                System.out.println("Please provide valid number");
            }
            System.out.println(String.format("So far you typed following" +
                    " numbers :%s", guessedNumbers));
        }

        Set<Integer> winningNumbers = runLottery();
        int hits = returnScore(guessedNumbers, winningNumbers);
        System.out.println(String.format("You guessed %d numbers", hits));
    }

    private static int returnScore(Set<Integer> guessedNumbers, Set<Integer> winningNumbers) {
        int score=0;
        for (Integer number:winningNumbers){
            if (guessedNumbers.contains(number)){
                score++;
            }
        }
        return score;
    }

    private static Set<Integer> runLottery() {
        Set<Integer> generatedNumbers = new TreeSet<>();
        Random random = new Random();
        while (generatedNumbers.size()<6){
            generatedNumbers.add(1+random.nextInt(48));
        }
        System.out.println(String.format("Winning numbers are : %s", generatedNumbers));
        return generatedNumbers;
    }
}
