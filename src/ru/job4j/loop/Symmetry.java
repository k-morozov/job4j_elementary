package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
//        StringBuilder number = new StringBuilder(Integer.toString(i));
//        return number.toString().equals(number.reverse().toString());
        String num = Integer.toString(i);
        for (int pos = 0; pos < num.length() / 2; pos++) {
            if (num.charAt(pos) != num.charAt(num.length() - pos - 1)) {
                return false;
            }
        }
        return true;
    }
}
