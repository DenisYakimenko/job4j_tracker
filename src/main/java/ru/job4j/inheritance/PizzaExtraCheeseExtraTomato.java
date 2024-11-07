package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    @Override
    public String name() {
        super.name();
        return super.name() + " + " + "extra tomato";
    }
}
