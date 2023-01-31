package com.bonkahr;

public class PoinMain {
    public static void main(String[] args) {

        Point point = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println(point.distance());
        System.out.println(point.distance(second));
        System.out.println(point.distance(2,2));

        Point first = new Point();
        System.out.println(first.distance());
    }

}
