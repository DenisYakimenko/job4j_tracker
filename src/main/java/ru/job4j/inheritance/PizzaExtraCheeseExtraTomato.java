package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    @Override
    public String name() {
        super.name();
        return "Just tasty pizza + extra cheese + extra tomato";
    }
}