package com.bonkahr;

import java.util.Arrays;

public class SortOdd {

    public static int[] sortArray(int[] array){
        int[] arr = array.clone();
        Arrays.sort(arr);
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                arr[i] = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,4,17,13,5,6,8,23,4};
        System.out.println(array[1]);
        System.out.println(Arrays.toString(sortArray(array)));
    }
}
