package com.bonkahr;

public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    public Car(int gears, int speed, boolean isManual) {
        super(1, gears, speed);
        this.wheels = 5;
        this.doors = 5;
        this.gears = gears;
        this.isManual = isManual;
    }
}
