package com.bonkahr;

public class PositionAverage {

    public static float positionAverage(String s1, String s2, String s3) {
        int totalIndexes = 0;
        int totalDigits = s1.length() + s2.length() + s3.length();
        for (int j = 0; j < s1.length(); j++) {

            int a = s1.charAt(j);
            int b = s2.charAt(j);
            if (a == b) {
                totalIndexes++;
            }
        }
        for (int j = 0; j < s1.length(); j++) {

            int a = s1.charAt(j);
            int b = s3.charAt(j);
            if (a == b) {
                totalIndexes++;
            }
        }

        for (int j = 0; j < s2.length(); j++) {

            int a = s2.charAt(j);
            int b = s3.charAt(j);
            if (a == b) {
                totalIndexes++;
            }
        }

        System.out.println("indexes = " + totalIndexes);
        System.out.println("digits = " + totalDigits);
        return ((float) totalIndexes / (float) totalDigits) * 100;
    }

    public static void main(String[] args) {
        String s1 = "6900690040";
        String s2 = "4690606946";
        String s3 = "9990494604";

        float meanPercentage = positionAverage(s1,s2,s3);
        System.out.println(meanPercentage);
    }
}
