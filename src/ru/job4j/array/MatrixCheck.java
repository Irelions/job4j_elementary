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
     * @param board - двумерный массив
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

    /**
     *
     * @param board  - двумерный массив
     * @return - array[] - диагональ массива "board"
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    /**
     *
     * @param board - двумерный массив
     * @return boolean - Проверка на наличие полностью заполненной строки или столбца сиволом "X"
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (monoHorizontal(board, i) || monoVertical(board, i)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
