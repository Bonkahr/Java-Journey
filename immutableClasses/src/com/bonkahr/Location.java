package com.bonkahr;

import java.util.HashMap;
import java.util.Map;

public record Location(int locationID, String description,
                       Map<String, Integer> exits) {
    public Location(int locationID, String description,
                    Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = exits;
        this.exits.put("Q", 0);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }

//    public void addExit(String direction, int location){
//        exits.put(direction, location);
//    }
}
