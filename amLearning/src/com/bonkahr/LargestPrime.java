package com.bonkahr;

public class LargestPrime {

    public static int getLargestPrime(int number){
        int ourPrime = 0;

        for (int n = 3; n <= number/2 ; n++) {
            if(number % n== 0){
                ourPrime = n;
            }
            return ourPrime;
        }
        return -1;
    }

    public static void main(String[] args) {
        int prime = getLargestPrime(130);
        System.out.println(prime);
    }

}
