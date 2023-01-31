package com.bonkahr;

import java.util.ArrayList;
import java.util.List;

public class letsCode {

    public int addSum(int number){
        String digits = "" + number;
        String trimmed = digits.trim();
        int sum = 0;

        List<Character> list = new ArrayList<>();
        for (int j = 0; j < trimmed.length(); j++){
            char character = trimmed.charAt(j);
            list.add(character);
        }

        List<Integer> integers = new ArrayList<>();
        for (int j = 0; j < list.size(); j++){
            int x = Integer.parseInt(String.valueOf(list));
            integers.add(x);
        }

        for (int n : integers){
            sum += n;
        }


        return sum;
    }
}
