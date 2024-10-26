package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    void whenPoints00And20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expectedDistance = 2.0;
        assertEquals(expectedDistance, a.distance(b), 0.01);
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        Point a = new Point(-1, -1);
        Point b = new Point(1, 1);
        double expectedDistance = 2.83;
        assertEquals(expectedDistance, a.distance(b), 0.01);
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        Point a = new Point(-2, -2);
        Point b = new Point(2, 2);
        double expectedDistance = 5.66;
        assertEquals(expectedDistance, a.distance(b), 0.01);
    }

    @Test
    void whenPoint010and000Then1() {
        Point c = new Point(0, 1, 0);
        Point d = new Point(0, 0, 0);
        double expectedDistance = 1.0;
        assertEquals(expectedDistance, c.distance(d), 0.01);
    }
}