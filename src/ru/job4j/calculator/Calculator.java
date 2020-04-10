package ru.job4j.calculator;

/**
 * Calculator
 * @author Evgeniy Ivanov (irelion@mail.ru)
 */
public class Calculator {

    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        return add(first, add(second, third));
    }
}
