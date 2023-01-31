package com.bonkahr;

public class House {
    private String name;
    private Wall wall;
    private Floor floor;
    private Sheets sheets;

    public House( String name, Wall wall, Floor floor,Sheets sheets) {
        this.name = name;
        this.wall = wall;
        this.floor = floor;
        this.sheets = sheets;
    }
}
