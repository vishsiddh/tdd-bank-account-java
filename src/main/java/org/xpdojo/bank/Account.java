package org.xpdojo.bank;

public class Account {
    public static double initialBalance = 10000;
    public static String AccountOwner = "121-5001";
    public static String AccountBeneficiary = "121-5005";
    public static double benefBalance = 0;

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

    public double transferMoney(Double amount) {
        initialBalance = initialBalance - amount;
        benefBalance = benefBalance + amount;
        return benefBalance;
    }

}
