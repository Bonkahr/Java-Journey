package com.bonkahr;

public class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " is starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " engine is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " is braking";
    }
}
