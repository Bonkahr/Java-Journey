package com.bonkahr;

public class Bonuses {

    public static String highAndLow(String[] string){


        int[] convertToInteger = new int[string.length];

        for (int j = 0; j < string.length; j++){
            convertToInteger[j] = Integer.parseInt(string[j]);
        }
        int maximum = 0;
        int minimum = 0;
        int temporaryMax = Integer.MAX_VALUE;
        int temporaryMin = Integer.MIN_VALUE;

        for (int k : convertToInteger) {
            if (k < temporaryMax) {
                temporaryMax = k;
                minimum = temporaryMax;
            }
        }

        for (int i : convertToInteger) {
            if (i > temporaryMin) {
                temporaryMin = i;
                maximum = temporaryMin;
            }
        }
        return maximum + " " + minimum;
    }

    public static void main(String[] args) {
        String[] string = {"123 345 437 894"};
        System.out.println(highAndLow(string));
    }
}
