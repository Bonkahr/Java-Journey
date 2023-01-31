package com.bonkahr;

public class WallMain {

    public static void main(String[] args) {
        Wall wall = new Wall(1.125,-1.0);
        System.out.println(wall);

        wall.setHeight(-1.5);
        System.out.println("width =" + wall.getHeight());


    }
}
