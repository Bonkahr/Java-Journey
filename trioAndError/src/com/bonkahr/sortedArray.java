package com.bonkahr;

public class sortedArray {

    private static int divisors(int n){
        int countedDivisors = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                countedDivisors++;
            }
        }
        return countedDivisors;
    }

    public static void main(String[] args) {
        System.out.println(divisors(0));

    }
}
