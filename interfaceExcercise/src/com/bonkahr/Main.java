package com.bonkahr;

public class Main {

    public static void main(String[] args) {
        ISavable dunk = new Player("James", 21, 12);
        saveObject(dunk);
        System.out.println(dunk);
    }

    public static void saveObject(ISavable objectToSave){
        for (int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }
}
