package ru.job4j.condition;

public class Triangle {
    Point first;
    Point second;
    Point third;

    public Triangle(Point a, Point b, Point c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    public boolean exist() {
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        return a + b > c && a + c > b && b + c > a;
    }

    public static void main(String[] args) {
        Point a = new Point(1, 1);
        Point b = new Point(3, 6);
        Point c = new Point(5, 1);

        Triangle triangle = new Triangle(a, b, c);

        System.out.println(triangle.exist());
    }
}