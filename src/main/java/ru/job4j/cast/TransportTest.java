package ru.job4j.cast;

public class TransportTest {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();

        Vehicle[] vehicles = new Vehicle[]{airplane, train, bus};
        for (Vehicle objeck : vehicles) {
            System.out.println(objeck.getDescription());
            objeck.movie();
        }

    }
}
