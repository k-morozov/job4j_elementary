package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        boolean flag = true;
        StringBuilder rsl = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                flag = true;
                continue;
            }
            if (flag) {
                rsl.append(s.charAt(i));
                flag = false;
            }
        }
        return rsl.toString();
    }
}
