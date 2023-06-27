package com.javacourse.model;

public class GiftCard {
    private int id;
    private double balance;

    public GiftCard(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void redeem(double amount) {
        balance -= amount;
    }
}
