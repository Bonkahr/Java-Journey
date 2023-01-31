package com.bonkahr;

public class Refers extends CalculateScore {
    public Refers(int engineeringMaths, int engineeringScience, int electricalScience, int measurements, int generalSkills) {
        super(engineeringMaths, engineeringScience, electricalScience, measurements, generalSkills);
    }

   private boolean engineeringMaths(){
        return  getEngineeringMaths() < 40;
   }

   private boolean engineeringScience(){
       return getEngineeringScience() < 40;
   }

   private boolean electricalScience(){
        return getElectricalScience() < 40;
   }

   private boolean measurement(){
        return getMeasurements() < 40;
   }

   private boolean generalSkills(){
        return getGeneralSkills() < 40;
   }


   public boolean hasRefer(){
        return (engineeringMaths() || engineeringScience() || electricalScience() || measurement() || generalSkills());
   }

   public void referIn(boolean unit){
        if (hasRefer()) {
            if (unit) {
                System.out.println("Refer in");
            }
        }
   }

   public void refers(){
        referIn(engineeringMaths());

   }


}
