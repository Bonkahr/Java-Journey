package com.bonkahr;

public class VipCustomerMain {

    public static void main(String[] args) {
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("bob", " daniel.com");
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("james ", "james.com ", 67);
        System.out.println(person3.getName());
    }
}
