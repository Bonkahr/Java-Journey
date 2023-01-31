package com.bonkahr;

public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("full name= " + person.getFullName());
        System.out.println("teen = " + person.isTeen());

        person.setFirstName("John");
        person.setAge(18);
        System.out.println("full name = " + person.getFullName());
        System.out.println("teen = "+ person.isTeen());
        person.setLastName("Smith");
        System.out.println("full name = " + person.getFullName());
    }
}
