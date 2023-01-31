package com.bonkahr;

public class WeekendWars {

    public  static String repeater(String string, long n){
        String result = "";
        for (long i = 0; i < n; i++){
//            result += string;
            result = result.concat(string);
        }
        return result;
    }

    public static String returns(int[] que){
        int ques = que[0];
        if (ques != 25){
            return "No";
        }
        for (int q : que) {
            return "Yes";
        }
        return "hello";
    }


    public static void main(String[] args) {
        System.out.println(repeater("animal", 5));
    }
}
