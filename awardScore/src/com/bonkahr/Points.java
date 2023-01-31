package com.bonkahr;

public class Points  extends Refers{
    public Points(int engineeringMaths, int engineeringScience, int electricalScience, int measurements, int generalSkills) {
        super(engineeringMaths, engineeringScience, electricalScience, measurements, generalSkills);
    }

    private int points(int score){
        if (score < 20){
            return 8;
        }
        else if (score < 40){
            return 7;
        }
        else if (score < 50){
            return 6;
        }
        else if (score < 60){
            return 5;
        }
        else if (score < 70){
            return 4;
        }
        else if (score < 80){
            return 3;
        }
        else if (score < 90){
            return 2;
        }
        return 1;
    }

    private int engineeringMaths(){
        return points(getEngineeringMaths());
    }

    private int engineeringScience(){
        return points(getEngineeringScience());
    }

    private int electricalScience(){
        return points(getElectricalScience());
    }

    private int measurements(){
        return points(getMeasurements());
    }

    private int generalSkills(){
        return points(getGeneralSkills());
    }


    public double scoreGrade(){
        return((double) engineeringMaths() + (double) engineeringScience() +
                    (double) electricalScience() + (double) measurements() + (double) generalSkills())/ 5;
    }

    public String PointsScored(){
        if (!hasRefer()) {
            if (scoreGrade() < 1.5) {
                return "Distinction of " + scoreGrade();
            } else if (scoreGrade() < 2.5) {
                return "Distinction of " + scoreGrade();
            } else if (scoreGrade() < 3.5) {
                return "Credit of " + scoreGrade();
            } else if (scoreGrade() < 4.5) {
                return "Credit of " + scoreGrade();
            } else if (scoreGrade() < 5.5) {
                return "Pass of " + scoreGrade();
            } else if (scoreGrade() <= 6) {
                return "Pass of " + scoreGrade();
            }
        }
        return "refereed";
    }
}
