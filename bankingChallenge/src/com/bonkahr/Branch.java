package com.bonkahr;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;

    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction){
        if (findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, initialTransaction));
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for (Customer customer : this.customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null) {
            existingCustomer.addTransaction(transaction);
            return true;
        } else {
            return false;
        }
    }

}
