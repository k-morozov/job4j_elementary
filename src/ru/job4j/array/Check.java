package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        if (data.length > 0) {
            boolean firstStatus = data[0];
            for (int i = 1; i < data.length; i++) {
                if (data[i] != firstStatus) {
                    return false;
                }
            }
        }
        return true;
    }
}
