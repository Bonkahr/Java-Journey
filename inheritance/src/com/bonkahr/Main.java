package com.bonkahr;

public class Main {

    public static void main(String[] args) {
	Vehicle car = new Vehicle(1, 7, 30);

	Car audi = new Car(5,200,true);
	audi.changeGear(2);

	Audi audiA4 = new Audi(6,240);

	audiA4.changeGear(7);
	audiA4.speed(220);

    }
}
