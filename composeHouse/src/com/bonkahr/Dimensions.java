package com.bonkahr;

public class Dimensions {
    private int width;
    private int length;

    public Dimensions(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String  sheetsDimensions(int width, int length){
        return "The Sheets width= " + width + " and the length is " + length;
    }

    public String wallDimensions(int width, int length){
        return "The wall width= " + width + " and the length is " + length;
    }
}
