package com.bonkahr;

public class ComplexNumbersMain {

    public static void main(String[] args) {
        ComplexNumbers number = new ComplexNumbers(1.0, 1.0);
        ComplexNumbers newNumber = new ComplexNumbers(2.5, -1.5);

        number.add(1,1);
        System.out.println("number.real = " +  number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

        number.subtract(newNumber);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

        newNumber.subtract(number);
        System.out.println("newNumber.real= " + newNumber.getReal());
        System.out.println("newNumber.imaginary= " + newNumber.getImaginary());
    }
}
