package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point a = new Point(1, 1);
        Point b = new Point(3, 6);
        Point c = new Point(5, 1);

        Triangle triangle = new Triangle(a, b, c);

        boolean expected = triangle.exist();
        assertThat(expected, is(true));
    }
}