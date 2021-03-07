package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int valueRub) {
        return valueRub / 70;
    }

    public static int rubleToDollar(int valueRub) {
        return valueRub / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        int dollars = Converter.rubleToDollar(121);
        System.out.println("120 rubles are " + dollars + " dollars.");
    }
}
