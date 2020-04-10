package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point a = new Point(1, 1);
        Point b = new Point(3, 6);
        Point c = new Point(5, 1);

        TrgArea triangleArea = new TrgArea(a, b, c);

        double expected = triangleArea.area();
        double out = 73.85;
        Assert.assertEquals(expected, out, 0.01);
    }
}
