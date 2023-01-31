package com.bonkahr;

public class CircleCylinderMain {

    public static void main(String[] args) {
        Circle shape = new Circle(3.74);
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getArea());
    }
}
