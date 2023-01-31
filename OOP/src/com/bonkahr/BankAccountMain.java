package com.bonkahr;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setBalance(23000);
        account.withdrawFunds(34000);
        account.depositFunds(23000);
        account.withdrawFunds(34000);
    }
}
