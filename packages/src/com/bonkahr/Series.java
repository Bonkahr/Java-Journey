package com.bonkahr;

public class Series {

    public static long nSum(int n){
        return ((long) n * (n +1)) / 2;
    }

    public static long factorial(int n){
        int product = 1;
        for (int j = 1; j < n; j ++){
            product *= j;
        }
        System.out.println(product);
        return product;
    }


    public static long fibonacci(int n){
       if (n == 0){
           return 0;
       }
       else if (n == 1){
           return 1;
       }
       long a = 1;
       long b = 0;
       long fibonacci = 0;

       for (int j = 0; j < n; j ++){
           fibonacci = (a + b);
           b = a;
           a = fibonacci;
       }
       return fibonacci;
    }
}
