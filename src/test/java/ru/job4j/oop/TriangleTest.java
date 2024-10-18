package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.Assertions.offset;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 8;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void testAreaWhenTriangleCannotBeFormed() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        Point c = new Point(2, 2);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        assertEquals(-1, result);
    }

}