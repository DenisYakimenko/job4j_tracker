package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void movie() {
        System.out.println("Автобус движется по скоростным трассам.");
    }

    @Override
    public String getDescription() {
        return "Это автобус.";
    }
}
