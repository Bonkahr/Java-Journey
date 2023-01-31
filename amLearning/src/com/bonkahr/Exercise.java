package com.bonkahr;

import java.util.Scanner;

public class Exercise {

    public static void inputThenPrintSumAndAverage() {
        Scanner input = new Scanner(System.in);
        boolean invalidNumber = true;
        int counter = 0;
        int sum = 0;
        while (invalidNumber) {
            invalidNumber = input.hasNextInt();
            if (invalidNumber) {
                int number = input.nextInt();
                sum += number;
                counter++;
            } else {
                break;
            }
        }
        double average = new Double(sum) / new Double(counter);
        long avg = Math.round(average);
        System.out.println("SUM = " + sum + " AVG = "+ avg);
    }



    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
