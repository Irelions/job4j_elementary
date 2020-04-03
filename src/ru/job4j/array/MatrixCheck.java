package ru.job4j.array;

public class MatrixCheck {

    /**
     *
     * @param board - двумерный массив
     * @param row - индекс проверяемой строки
     * @return - boolean - вся строка "row" массива "board" заполнена символом "Х"
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     *
     * @param board - вумерный массив
     * @param column - индекс проверяемой колонки
     * @return boolean - весь столбец "column" массива "board" заполнен символом "Х"
     */

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
