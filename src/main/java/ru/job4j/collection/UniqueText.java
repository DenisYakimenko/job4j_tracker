package ru.job4j.collection;

import java.util.Collections;
import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String origins : origin) {
            check.add(origins);
        }
        for (String texts : text) {
           if (!check.contains(texts)) {
               return false;
            }
        }
         return true;
    }
}
