package ru.job4j.array;


public class MinDiapason {

    /**
     *
     * @param array - Массив
     * @param start - Начальный индекс
     * @param finish - Конечный индекс
     * @return int - Минимальное число массива array в диапазоне srart - finish
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
