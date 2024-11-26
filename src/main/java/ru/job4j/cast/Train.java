package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void movie() {
        System.out.println("Поезд движется по рельсам.");
    }

    @Override
    public String getDescription() {
        return "Это поезд.";
    }
}
