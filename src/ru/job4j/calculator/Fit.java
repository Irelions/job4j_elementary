package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }


    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        int manHeight = 175;
        int womanHeight = 170;

        double man = Fit.manWeight(manHeight);
        double woman = Fit.womanWeight(womanHeight);

        System.out.println("Man " + manHeight + " is " + man);
        System.out.println("Woman " + womanHeight + " is " + woman);
    }

}
