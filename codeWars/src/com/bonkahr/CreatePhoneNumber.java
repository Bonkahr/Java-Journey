package com.bonkahr;

import java.util.Arrays;

public class CreatePhoneNumber {

    public static String createPhoneNumber(int [] numbers){
        return Arrays.toString(numbers);
    }

    public static void main(String[] args) {
        System.out.println(createPhoneNumber((new int[]{1, 2, 3, 4, 5,
        6, 7, 8, 9, 0})));

        String name = "Daniel";

        String name2 = name.replace("D", "K");
        System.out.println(name2);
    }
}
