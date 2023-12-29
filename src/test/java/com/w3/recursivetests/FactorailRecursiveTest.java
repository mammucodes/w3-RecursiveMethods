package com.w3.recursivetests;

import com.w3.recursive.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorailRecursiveTest {
    @Test
    public void getFactorialNumberTest() {
        int n = 3;
        Factorial f = new Factorial();
        int result = f.getFactorialNumber(n);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void getFactorialNegativeNumberTest() {
        int n = -3;
        Factorial f = new Factorial();
        Assertions.assertThrows(IllegalArgumentException.class, () -> f.getFactorialNumber(n));
    }
}

