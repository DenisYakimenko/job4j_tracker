package ru.job4j.stream;

import ru.job4j.hashmap.Pupil;

public class Profile {
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
