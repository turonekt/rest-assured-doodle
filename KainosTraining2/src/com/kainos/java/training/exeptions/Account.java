package com.kainos.java.training.exeptions;

public class Account {
    private String accountName;
    private double balance;

    public Account(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    public int withdraw(int amount) throws InsufficientFundsExeption {
        if (amount>balance){
            throw new InsufficientFundsExeption(balance);
        }
        balance-=amount;
        return amount;
    }

    public double getBalance() {
        return balance;
    }
}