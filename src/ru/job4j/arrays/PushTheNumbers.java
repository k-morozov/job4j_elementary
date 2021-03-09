package ru.job4j.arrays;

public class PushTheNumbers {

    public static void push(int[][] array, int row, int column) {
        int valueMain = array[row][column];
        for (int idx = 0; idx < row; idx++) {
            array[idx][column] = array[idx + 1][column];
        }
        for (int idx = array.length - 1; idx > row; idx--) {
            array[idx][column] = array[idx - 1][column];
        }
        for (int idx = 0; idx < column; idx++) {
            array[row][idx] = array[row][idx + 1];
        }
        for (int idx = array.length - 1; idx > column; idx--) {
            array[row][idx] = array[row][idx - 1];
        }
        array[row][column] = 0;

    }

}