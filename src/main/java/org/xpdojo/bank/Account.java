package org.xpdojo.bank;

public class Account {
    public static double initialBalance = 10000;

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

    public double withDrawMoney(Double amount) {
        initialBalance = initialBalance - amount;
        return initialBalance;
    }
}
