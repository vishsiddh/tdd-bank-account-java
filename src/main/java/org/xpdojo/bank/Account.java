package org.xpdojo.bank;

public class Account {
    double initialBalance = 10000;

    public Account()
    {
    }
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
    }


    public double addMoney(Double amount) {
        initialBalance = initialBalance + amount;
        return initialBalance;
    }
}
