package com.bonkahr;

import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(squares(99991));
       // System.out.println(overTheRoad(23633656673L, 310027696726L));

        int mean = getAverage(new int[] {1,1,1,1,1,1,1,2});
        System.out.println(mean);

        System.out.println(quarterOf(11));

        System.out.println(oddOrEven(new int[] {5,4,5,6}));

    }

    //Complete the function that takes an odd integer (0 < n < 1000000)
    // which is the difference between two consecutive perfect squares, and
    // return these squares as a string in the format "bigger-smaller"

    public static String squares(int x) {
        if (x % 2 != 0) {
            for (int j = 0; j < 1000000; j++) {
                long a = (long) Math.pow(j, 2);
                long b = (long) Math.pow((j + 1), 2);

                if (b - a == x) {
                    return b + "-" + a;
                }
            }
        }
        return null;
    }
/*
    public static long overTheRoad(long address, long n ){
            n = n * 2;

            long a = 0;

            if (address == 1){
                a = n;
            }
            long x = 1;
            while (x != address ){
                if (x % 2 != 0) {
                    a = n - 2;
                    n -= 2;
                }
                x++;
            }
            return a;
    }*/

    public static int getAverage(int[] marks){
        double sum = 0;
        for (int j : marks){
            sum += j;
        }
        System.out.println(sum);
        return (int)(sum / marks.length);
    }

    public static int quarterOf(int month){
        return switch (month) {
            case 1, 2, 3 -> 1;
            case 4, 5, 6 -> 2;
            case 7, 8, 9 -> 3;
            case 10, 11, 12 -> 4;
            default -> -1;
        };
    }

    public static String oddOrEven(int[] array){
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        if (sum % 2 == 0){
            return "even";
        }
        return "odd";
    }
}
