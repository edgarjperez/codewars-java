package com.perez.edgar.codewars.strings;

public class StringsKata {
    public static String maskify(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.length() < 4){
            return str;
        }

        StringBuilder result = new StringBuilder();
        int mask = str.length() - 4;
        for (int i = 0; i < mask; i++) {
            result.append("#");
        }
        result.append(str, mask, str.length());
        return result.toString();
    }

    public static String reversedString(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
