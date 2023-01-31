package com.bonkahr;
// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generic car class.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).

import java.util.concurrent.Callable;

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String moving(){
        return "vehicle is not moving";
    }
}

class BMW extends Car {

    public BMW() {
        super(6, "BMW 6");
    }

    @Override
    public String moving() {
        return "BMW moves fast, speed of 300KM/h";
    }
}

class Mazda extends Car{

    public Mazda() {
        super(4,"Mazda 4" );
    }

    @Override
    public String moving() {
        return getName()  +
                " and " + getCylinders() + " cylinders.";
    }
}

class Toyota extends Car{

    public Toyota() {
        super(8, "LandCrusher V8");
    }

    @Override
    public String moving() {
        return getName() + " has " + getCylinders() + "Cylinders"
                + " and " + "moving at 280 KM/h";
    }
}

class Unkown extends Car{
    public Unkown() {
        super(0, "Unknown");
    }

}

public class Main {

    public static void main(String[] args) {
	    for (int i = 0; i < 10; i++){
	        Car car = ourCar();
            System.out.println("Car # " + i + ":" + car.getName() +
                            "\n" + car.moving() + "\n");
        }
    }

    public static Car ourCar(){
        Car ourCar = new Car(6,"Car");

        int carNumber = (int)(Math.random() * 4) + 1;
        System.out.println("Random Number is: " + carNumber);

        return switch (carNumber) {
            case 1 -> new BMW();
            case 2 -> new Mazda();
            case 3 -> new Toyota();
            case 4 -> new Unkown();
            default -> null;
        };
    }
}
