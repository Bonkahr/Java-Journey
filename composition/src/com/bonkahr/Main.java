package com.bonkahr;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(15, 30);

        Bed bed = new Bed("Cris", 3, 4, 4, 5);

        Lamp lamp = new Lamp("indian", true, 60);

        Bedroom bedroom = new Bedroom("james", wall1, wall2, wall3,
                wall4, ceiling, bed, lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
