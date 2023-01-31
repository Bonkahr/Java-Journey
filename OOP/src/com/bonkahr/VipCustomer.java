package com.bonkahr;

public class VipCustomer {
    private String name;
    private String emailAddress;
    private double creditLimit;

    public VipCustomer(){
        this("default Name", "james@gmail.com", 59.0);
    }

    public VipCustomer(String name, String emailAddress){
        this(name, emailAddress, 70);
        this.name = name;
        this.emailAddress =emailAddress;
    }

    public VipCustomer(String name, String emailAddress, double creditLimit){
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
