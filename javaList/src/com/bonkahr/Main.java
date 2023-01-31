package com.bonkahr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        LearningLists list = new LearningLists(myList);
        myList.add("Biker");
        myList.add("Animal");
        myList.add("Racer");

        System.out.println(Arrays.toString(list.listItems(myList)));
        System.out.println(Arrays.toString(list.sortItems(myList)));

    }


}
