package com.kainos.java.training.exeptions;

public class InsufficientFundsExeption extends Exception {
    private Double balance;

    @Override
    public String getMessage() {
        if (balance == null) {
            return "Not enough money on the account!";
        }
        else {
            return "Found only "+balance+" on the account";
        }
    }

    public InsufficientFundsExeption(double message) {
        balance = message;
    }
}

