package com.bonkahr;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int w = getSum(-1,6);
        System.out.println(w);

        int year = nb_year(1500000,0.25,1000,2000000);
        System.out.println(year);
    }

    public static int getSum(int a, int b){
        int x = Math.min(a, b);
        int y = Math.max(a,b);
        int sum = 0;

        for (int j = x; j <=y; j++){
            if (x == y){
                return x;
            }
            sum += j;
        }
        return sum;
    }

    public static int nb_year(int population, double percentage,int inhabitants, int surpass ){
        double percentageIncrease = 1 + (percentage / 100);

        int years = 0;

        while (population < surpass){
            population = (int)(population * percentageIncrease) + inhabitants;
            years += 1;
        }
        return years;
    }

    public static int countPassengers(ArrayList<int[]> stops){
        int numberOfItems = stops.size();
        if (numberOfItems > 2){
            return -1;
        }
        return 1;
    }
}
