package org.xpdojo.bank;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    //Add amount in the account
    public void depositAnAmountToIncreaseTheBalance()

    {
        Account intAccount = new Account();
        assertEquals(20000, intAccount.addMoney(10000.00));
    }
    @Test
    //Withdraw money from the account
    public void withdrawAnAmountToDecreaseTheBalance()
    {
        Account intAccount = new Account();
        assertEquals(9500, intAccount.withDrawMoney(10000.00));
    }
    @Test
    //Transfer money from the account
    public void transferMoney()
    {
        Account intAccount = new Account();
        assertEquals(500.00, intAccount.transferMoney(500.00));
    }

}

