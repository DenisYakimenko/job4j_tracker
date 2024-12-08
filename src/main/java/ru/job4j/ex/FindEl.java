package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (value[i] != null && value[i].equals(key)) {
                return i;
            }
        }
        throw new ElementNotFoundException("Элемент '" + key + "' не найден.");
    }

    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Porsche"};
        String key = "Toyota";
        try {
            int index = indexOf(array, key);
            System.out.println("Индекс элемента '" + key + "': " + index);
        } catch (ElementNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
