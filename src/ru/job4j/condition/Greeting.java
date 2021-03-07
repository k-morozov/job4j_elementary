package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea +=  "But I am a newbie.";
        int year = 2021;
        idea += year;
        System.out.println(idea);

        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println(rsl);
    }
}
