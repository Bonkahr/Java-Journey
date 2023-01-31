package com.bonkahr;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        // adding map items
        languages.put("Java", "A compiled high level, object-oriented, " +
                "platform independent language.");
        languages.put("Python", "An interpreted object-oriented, high-level " +
                "programming language.");
        languages.put("Algol", "Beginners All Purpose Symbolic Instruction " +
                "Code.");
        languages.put("Lisp", "Therein lies madness");

        String keys = "pascal";

        // searching items in a map
        if (languages.containsKey(keys)){
            System.out.println(keys + "already exists");
        }
        else {
            languages.put(keys, "is a programming language");
        }
        System.out.println(languages.get("java"));
        System.out.println("***************************************");

        // removing a key
        String languageKey = "Lisp";
        languages.remove(languageKey, "Therein lies madness");

        // listing map items
        for (String key: languages.keySet()){
            System.out.println(key + ": " + languages.get(key));
        }
    }
}
