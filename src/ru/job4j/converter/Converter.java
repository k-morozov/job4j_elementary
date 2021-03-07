package ru.job4j.converter;

public class Converter {
    public static double rubleToEuro(int value_rub) {
        return (double) value_rub / 70;
    }

    public static double rubleToDollar(int value_rub) {
        return (double) value_rub / 60;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        double dollars = Converter.rubleToDollar(121);
        System.out.println("120 rubles are " + dollars + " dollars.");
    }
}
