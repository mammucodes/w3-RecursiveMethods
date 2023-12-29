package com.w3.recursive;

public class FibonacciRecursive {

    public int getFibonacciNumber(int n) throws Exception {
        if (n < 0)
            throw new Exception("only positve n number allowed");
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int result = getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
        return result;
    }
}
