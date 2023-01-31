package com.bonkahr;

public class Sheets {
    private String manufacturer;
    private Dimensions dimensions;

    public Sheets(String manufacturer, Dimensions dimensions) {
        this.manufacturer = manufacturer;
        this.dimensions = dimensions;
    }

    public String dimensions(int width, int length){
       return dimensions.sheetsDimensions(width, length);
    }
}
