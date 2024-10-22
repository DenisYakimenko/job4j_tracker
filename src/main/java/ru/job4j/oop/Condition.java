package ru.job4j.oop;

public class Condition {

    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public int max(int a, int b, int c, int d) {
        return max(max(a, b), max(c, d));
    }

    public static void main(String[] args) {
        Condition finder = new Condition();
        System.out.println("Max of 2 numbers: " + finder.max(3, 7));
        System.out.println("Max of 3 numbers: " + finder.max(3, 7, 5));
        System.out.println("Max of 4 numbers: " + finder.max(3, 7, 5, 9));
    }
}
