package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {

    @Test
    public void ifa3andb7max7() {
        Condition finder = new Condition();
        assertEquals(7, finder.max(3, 7));

    }

    @Test
    public void ifa3andb7andc5max7() {
        Condition finder = new Condition();
        assertEquals(7, finder.max(3, 7, 5));
    }

    @Test
    public void ifa3andb7andc5andd9max9() {
        Condition finder = new Condition();
        assertEquals(9, finder.max(3, 7, 5, 9));
    }
}