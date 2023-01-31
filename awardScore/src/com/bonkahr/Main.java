package com.bonkahr;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Points points = new Points(87,89,91,65,67);
        String candidate = points.PointsScored();
        System.out.println(candidate);

    }

}
