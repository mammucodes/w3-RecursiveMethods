package com.w3.recursivetests;


import com.w3.recursive.FibonacciRecursive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciRecursiveTest {
    @Test
    public void FibonacciRecursiveTest() throws Exception {
        int n = 4;
        int expected = 3;

        FibonacciRecursive fbr = new FibonacciRecursive();
        int result = fbr.getFibonacciNumber(n);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void FibRecurssiveNegativeNumberTest() {
        int n = -5;
        FibonacciRecursive fbr = new FibonacciRecursive();
        Assertions.assertThrows(Exception.class, () -> fbr.getFibonacciNumber(n));
    }


}
