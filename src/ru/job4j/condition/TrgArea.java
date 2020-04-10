package ru.job4j.condition;

public class TrgArea {
    private Point first;
    private Point second;
    private Point third;
    private Triangle triangle;

    public TrgArea(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
        this.triangle = new Triangle(ap, bp, cp);
    }

    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /*private boolean exist(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }*/

   public double area() {
        double rsl;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (triangle.exist()) {
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

        TrgArea triangleArea = new TrgArea(a, b, c);

        System.out.println(triangleArea.area());
    }
}