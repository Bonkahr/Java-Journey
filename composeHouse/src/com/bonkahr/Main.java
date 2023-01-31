package com.bonkahr;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(12, 14);
        Sheets sheets = new Sheets("wakio", dimensions);

        String sheet = sheets.dimensions(12,35);
        System.out.println(sheet);
    }
}
