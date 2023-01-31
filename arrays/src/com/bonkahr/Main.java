package com.bonkahr;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       SortInArrays myArray = new SortInArrays();
        int[] arr = myArray.getIntegers();

        int[] sortedArray =  myArray.sortIntegers(arr);
        myArray.printArray(sortedArray);


    }
}
