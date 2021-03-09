package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int countData = 5;
        int[] data = new int[countData];
        for (int i = 0; i < countData; i++) {
            data[i] = i * 2 + 3;
        }

        for (int value : data
             ) {
            System.out.println(value);
        }
    }
}
