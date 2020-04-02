package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {

        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] price = new float[40];

        String[] names = new String[4];

        names[0] = "Agatha MacDonald";
        names[1] = "William Jacobson";
        names[2] = "Audrey Smith";
        names[3] = "Theresa Holiday";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

    }
}
