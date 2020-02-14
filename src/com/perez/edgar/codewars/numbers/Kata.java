package com.perez.edgar.codewars.numbers;

import java.util.Arrays;

public class Kata {

    public static double findAverage(int[] array){
        return Arrays.stream(array).average().orElse(Double.NaN);
    }

    public static String oddOrEven(int[] array){
        if(array.length == 0) return "even";
        int sum = Arrays.stream(array).sum();
        return sum % 2 == 0 ? "even" : "odd";
    }
}
