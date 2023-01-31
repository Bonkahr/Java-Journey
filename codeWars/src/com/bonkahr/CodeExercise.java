package com.bonkahr;

public class CodeExercise {

    private static int squareSum(int[] arr){
        int squares = 0;
        int sum = 0;

        for (int j = 0; j < arr.length; j++){
            if (j % 2 == 0){
                sum += arr[j];
            }else {
                squares += Math.pow(arr[j], 2);
            }
        }
        return squares + sum;
    }

    private static String buddy(long start, long limit){
        long sum1 = 0;
        long sum2 = 0;

        for (int i = 1; i <= start/2; i++){
            if (start % i == 0){
                sum1 += i;
                //System.out.println(i);
            }


        }

        for (int i = 1; i <= limit/2; i++){
            if (limit % i == 0){
                sum2 += i;
               // System.out.println(i);
            }
        }
        return "["+ sum1 + ", " + sum2 + "]";
    }

    public static void main(String[] args) {
        System.out.println(squareSum(new int[] {11,12,13,14,15}));
        System.out.println(buddy(1071625,1103735));

    }

}
