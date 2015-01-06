package com.thoughtworks.accountbalance;

import com.thoughtworks.account.AccountBalance;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        AccountBalance account = new AccountBalance(100);
        account.deposit(50);
        assertThat(account.getBalance(), is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        AccountBalance account = new AccountBalance(100);
        account.withdraw(50);
        assertThat(account.getBalance(), is(50));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        AccountBalance account = new AccountBalance(50);
        account.withdraw(100);
        assertThat(account.getBalance(), is(50));
    }
}
