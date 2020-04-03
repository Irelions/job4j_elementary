package ru.job4j.array;

public class MatrixCheck {

    /**
     *
     * @param board - Двумерный массив
     * @param row - индекс проверяемой строки
     * @return - boolean - вся строка "row" массива "board" заполнена символом "Х"
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
