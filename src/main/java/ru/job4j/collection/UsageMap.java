package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Denis@mail.ru", "Denis");
        map.put("semenovich@mail.ru", "Semen Semenovich");
        map.put("ivan_rabota@yandex.ru", "Ivan Ivanovich");
        map.put("Denis@mail.ru", "Denis");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
