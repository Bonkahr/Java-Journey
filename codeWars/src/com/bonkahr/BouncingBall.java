package com.bonkahr;

public class BouncingBall {
    public static int bouncingBall(double h, double b, double w){
        if ((h > 0 & h > w) & (b < 1 & b > 0 )){
            int seen = 1;
            h *= b;
            while (h > w){
                h *= b;
                seen += 2;
            }
            return seen;
        }
        return -1;
    }

    public static boolean isPrime(int n){
        if (n > 1){
            for (int i = 2 ; i < Math.sqrt(n); i++){
                if (n % i == 0){
                    return false;
                }
            }
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(bouncingBall(3.0, 0.66, 1.5));
        System.out.println(isPrime(65));
    }
}
