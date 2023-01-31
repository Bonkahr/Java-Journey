package com.bonkahr;

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had this values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

import java.util.Scanner;

public class SortInArrays {

    public int[] getIntegers() {
        Scanner input = new Scanner(System.in);

        int[] userArray = new int[5];

        for (int i = 0; i < userArray.length; i++) {
            System.out.println("Enter your " + i + " number: ");
            userArray[i] = input.nextInt();
        }
        return userArray;
    }

    public void printArray(int[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.println("Element " + j + " contents " + array[j] );
        }
    }

    public int[] sortIntegers(int[] arrays) {
//       int[] sortedArray = new int[arrays.length];
//        for (int i = 0; i < arrays.length; i++) {
//            sortedArray[i] = arrays[i];
//        }
//better way for the code above
        int[] sortedArray = java.util.Arrays.copyOf(arrays,arrays.length);

        boolean flag = true;
        int temporary;

        while (flag) {
            flag = false;

            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temporary = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temporary;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
