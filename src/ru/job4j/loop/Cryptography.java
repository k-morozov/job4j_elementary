package ru.job4j.loop;

public class Cryptography {
    @SuppressWarnings("checkstyle:LocalVariableName")
    public static String code(String s) {
        if (s.isEmpty()) {
            return "empty";
        }
        int lastCountSym = 4;
        if (s.length() < lastCountSym) {
            return s;
        }
        StringBuilder str = new StringBuilder(s);
        char cryptoSym = '#';
        for (int i = 0; i < str.length() - lastCountSym; i++) {
            str.setCharAt(i, cryptoSym);
        }
        return str.toString();
    }
}
