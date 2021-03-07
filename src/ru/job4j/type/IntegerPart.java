package ru.job4j.type;

public class IntegerPart {
    public static int foo(float num) {
        return (int) num;
    }

    public static void main(String[] args) {
        float floatNum = 2.6f;
        int integerNum = foo(floatNum);
        System.out.println(integerNum);
    }
}
