package ru.job4j.condition;

public class SqArea {

    public static double square(int p, int k) {

        double h = p / (2 * (k + 1));
        double l = h * k;

        double rsl = h * l;
        return rsl;
    }

    public static void main(String[] args) {

        int p = 6;
        int k = 2;

        double result1 = SqArea.square(p, k);
        System.out.println(" p = " + p + ", k = " + k + ", s = " + result1);

    }
}
