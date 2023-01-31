package com.bonkahr;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName.trim();
    }

    public  void  setLastName(String lastName){
        this.lastName = lastName.trim();
    }

    public void setAge(int age){
        if (age < 0 || age > 100){
            this.age = 0;
        }else {
            this.age =age;
        }
    }

    public boolean isTeen(){
        return age > 12 && age < 20;
    }

    public String getFullName(){
        boolean emptyFirstName = firstName.isEmpty();
        boolean emptyLastName = lastName.isEmpty();
        if(emptyFirstName && emptyLastName){
            return "";
        }
        else if (emptyFirstName){
            return lastName;
        }
        else if (emptyLastName){
            return firstName;
        }
        return firstName + " " + lastName;
    }
}
