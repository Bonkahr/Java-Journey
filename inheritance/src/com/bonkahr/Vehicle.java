package com.bonkahr;

public class Vehicle {
    private int steering;
    private int gears;
    private int speed;

    public Vehicle(int steering, int gears, int speed) {
        this.steering = steering;
        this.gears = gears;
        this.speed = speed;
    }

    public int getSteering() {
        return steering;
    }

    public int getGears() {
        return gears;
    }

    public int getSpeed() {
        return speed;
    }

    public void changeGear(int gearNumber){
        System.out.println("changed to gear number: " + gearNumber);
    }

    public void speed(int speed){
        System.out.println("moving at a speed of: " + speed);
    }
}
