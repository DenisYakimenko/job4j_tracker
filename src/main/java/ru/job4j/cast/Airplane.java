package ru.job4j.cast;

public class Airplane implements Vehicle {
    @Override
    public void movie() {
        System.out.println("Самолет летит по воздуху.");
    }

    @Override
    public String getDescription() {
        return "Это самолет.";
    }
}
