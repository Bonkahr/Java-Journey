package com.bonkahr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(23);
        numbers.add(35);
        numbers.add(2);
        numbers.add(45);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
//        numbers.clear();
        System.out.println(numbers);
    }
}
