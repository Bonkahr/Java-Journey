package com.bonkahr;

public class Point {
    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        int x2 = 0;
        int y2 = 0;

        double distance = Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y -y2));
        return distance;
    }

    public double distance(int x, int y){
        double distance = Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y -this.y));
        return distance;
    }

    public double distance(Point point){
        return distance(point.x, point.y);
    }
}
