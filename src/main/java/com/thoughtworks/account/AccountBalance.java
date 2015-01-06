package com.thoughtworks.account;

/**
 * Created by louie on 1/6/15.
 */
public class AccountBalance {

    private int balance;

    public AccountBalance(int startingBalance) {
        this.balance = startingBalance;
    }

    public void deposit(int deposit) {
        this.balance = this.balance + deposit;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int withdrawal) {
        if (withdrawal < balance) {
            this.balance = this.balance - withdrawal;
        }
    }
}
