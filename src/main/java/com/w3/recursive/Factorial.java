package com.w3.recursive;

public class Factorial {

    //this method takes non-negative numbers and returns factorial
    //for negative numbers throws IllegalArgumentException
    public int getFactorialNumber(int n) {
        if (n < 0)
            throw new IllegalArgumentException("positive numbers are allowed");
        if (n == 0)
            return 1;
        int result = n * getFactorialNumber(n - 1);
        return result;
    }
}
