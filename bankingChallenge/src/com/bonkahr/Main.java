package com.bonkahr;

public class Main {

    public static void main(String[] args) {
	Bank bank = new Bank("national");

	bank.addBranch("adula");

	bank.addCustomer("adula", "tuta", 50.05);
	bank.addCustomer("adula", "mike", 175.34);
	bank.addCustomer("adula", "percy", 220.12);

	bank.addCustomerTransaction("adula", "tuta", 44.22);
	bank.addCustomerTransaction("adula", "tuta", 12.44);
	bank.addCustomerTransaction("adula", "mike", 1.65);

	bank.listCustomers("adula", true);

    }


}
