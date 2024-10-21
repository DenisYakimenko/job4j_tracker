package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int y, int a, int b, int c) {
        return sum(y) + multiply(a) + minus(b) + divide(c);
    }

    public static void main(String[] args) {
        int y = 10;
        int a = 5;
        int b = 15;
        int c = 25;
        int result = Calculator.sum(y);
        Calculator calculator = new Calculator();
        int multiply = calculator.multiply(a);
        int minus = calculator.minus(b);
        int divide = calculator.divide(c);
        int allOperationsResult = calculator.sumAllOperation(y, a, b, c);
        System.out.println(result);
        System.out.println(multiply);
        System.out.println(minus);
        System.out.println(divide);
        System.out.println(allOperationsResult);
    }
}
