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

    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public double area() {
        double rsl;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist()) {
            rsl = Math.sqrt((p * (p - a)) * (p * (p - b)) * (p * (p - c)));
        } else {
            rsl = -1;
        }
        return rsl;
    }

    public static void main(String[] args) {
        Point a = new Point(1, 1);
        Point b = new Point(3, 6);
        Point c = new Point(5, 1);

        Triangle triangle = new Triangle(a, b, c);

        System.out.println(triangle.area());
    }
}