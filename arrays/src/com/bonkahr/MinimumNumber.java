package com.bonkahr;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumNumber {

    private static final Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {

        int integer = readInteger();

        int[] reader = readElements(integer);
        System.out.println(Arrays.toString(reader));

        int returnedMin = findMin(reader);
        System.out.println(returnedMin);
    }

    private static int readInteger(){
        Scanner scanner= new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int count){
        Scanner scanner= new Scanner(System.in);
        int [] userArray = new int[count];

            for (int j = 0; j < userArray.length; j++){
                userArray[j] = scanner.nextInt();
            }
        return userArray;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;

        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
