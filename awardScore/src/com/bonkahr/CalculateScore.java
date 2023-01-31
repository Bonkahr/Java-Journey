package com.bonkahr;

public class CalculateScore {
    private final int engineeringMaths;
    private final int engineeringScience;
    private final int electricalScience;
    private final int measurements;
    private final int generalSkills;



    public CalculateScore(int engineeringMaths, int engineeringScience, int electricalScience,
                          int measurements, int generalSkills) {
        this.engineeringMaths = engineeringMaths;
        this.engineeringScience = engineeringScience;
        this.electricalScience = electricalScience;
        this.measurements = measurements;
        this.generalSkills = generalSkills;
    }

    public int getEngineeringMaths() {
        return engineeringMaths;
    }

    public int getEngineeringScience() {
        return engineeringScience;
    }

    public int getElectricalScience() {
        return electricalScience;
    }

    public int getMeasurements() {
        return measurements;
    }

    public int getGeneralSkills() {
        return generalSkills;
    }

}
