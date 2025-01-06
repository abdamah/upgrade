package com.riigsoft.test;

public class Account {

    private  double balance = 500;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }


    protected void withdraw(double amount){
        balance -= amount;
    }




}

