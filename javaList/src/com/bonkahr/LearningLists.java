package com.bonkahr;

import java.util.*;

public class LearningLists {

    private List<String> list =  new ArrayList<>();

    public LearningLists(List<String> list) {
        this.list = list;
    }


    public String[] listItems(List<String> list){
        String[] array = new String[list.size()];
        for (int s = 0; s < list.size(); s++) {
            array[s] = list.get(s);
        }
        return array;
    }

    public String[] sortItems(List<String> list){
        Collections.sort(list);
        String[] strings = new String[list.size()];

        for (int s = 0; s < list.size(); s++){
            strings[s] = list.get(s);
        }
        return strings;
    }
}
