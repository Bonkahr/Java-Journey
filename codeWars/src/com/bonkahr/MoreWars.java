package com.bonkahr;

import java.lang.constant.Constable;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MoreWars {

    public static Constable remove(int x){
        while (x > 0){
            x /= 10;
            if (x % 3 == 0){
                return x;
            }
        }
        return null;
    }

    public static String saving(double nCarCost, double oldCarValue,
                               double saving, double depreciation){

        if (oldCarValue > nCarCost){
            int[] b = {0, (int) (oldCarValue - nCarCost)};
            return Arrays.toString(b);
        }
        double amount = oldCarValue -((depreciation / 10) * oldCarValue);
        nCarCost -= (depreciation / 100) * nCarCost;
        oldCarValue -= (depreciation / 100) * oldCarValue;

        System.out.println(amount - nCarCost + " dep: " + depreciation);
        int numberMonths = 0;
        while ( amount < nCarCost){
            amount += saving - ((depreciation / 100) * oldCarValue);
            nCarCost -= depreciation / 100 * nCarCost;
            oldCarValue -= depreciation/ 100 * oldCarValue;
            if (numberMonths % 2 == 0){
                depreciation += 0.5;
            }
            numberMonths++;

            System.out.println(amount - nCarCost + " dep: " + depreciation);
        }
        int[] c = {numberMonths, (int) (amount - nCarCost)};
        return Arrays.toString(c);
    }


    public static void main(String[] args) {
        System.out.println(remove(12345));
        System.out.println(saving(12000, 8000, 1000,
                1.5));
    }
}
