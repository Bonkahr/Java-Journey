package com.bonkahr;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the numbers you intend to use");
        int arrayLength = scanner.nextInt();
        int[] myArray = getIntegers(arrayLength);
        int[] clone = myArray.clone();
        printArray(myArray);
        printArray(sortArray(myArray));

    }

    private static int[] getIntegers(int number) {
        int[] array = new int[number];

        System.out.println("Enter " + number + " integers\r");
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static void printArray (int[] array){
        System.out.println("Your input numbers are: ");
        for (int j : array) {
            System.out.println(j);
        }
    }

   private static int[] sortArray(int[] array) {
        int[] sortedArray = array.clone();
        //int[] sortedArray = new int[array.length];
        int holdNumber = array[1];

        boolean flag = true;

        while(flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    holdNumber = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = holdNumber;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
