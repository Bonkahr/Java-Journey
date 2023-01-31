package com.bonkahr;

import java.util.Arrays;

public class Vibes {

    public static void array(int[] array){
        array[2] = 5;
        array = new int[] {5,2,3,4,5,6};

        array[5] = 2;
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] myArray = new int[5];
        int[] anotherArray = myArray;

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(anotherArray));
        array(myArray);
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(anotherArray));

    }
}

