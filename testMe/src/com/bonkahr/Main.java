package com.bonkahr;

public class Main {

    public static void main(String[] args) {

        System.out.println(canPack(5,6,5));
    }


    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigBags = goal % 5; //calculate remainder of big bags needed
        int noOfBags = goal / 5; // calculate the number of big bags needed from goal
        int noOfBigBags = bigCount * 5;  //kgs in big bags
        if (bigBags == 0 && bigCount >= noOfBags) {
            return true;
        } else if (smallCount >= goal && goal > 0) {
            return true;
        } else if ((noOfBigBags + smallCount >= goal) && goal > 0) {
            return bigBags <= smallCount;
        }
        return false;
    }

}

