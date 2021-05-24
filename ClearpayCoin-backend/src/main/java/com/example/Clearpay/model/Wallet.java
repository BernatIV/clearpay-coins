package com.example.Clearpay.model;

public class Wallet {
    private Double balance;

    public Wallet(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
