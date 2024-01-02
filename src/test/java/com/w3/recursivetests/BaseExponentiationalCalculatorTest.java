package com.w3.recursivetests;

import com.w3.recursive.BaseExponentiationalCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BaseExponentiationalCalculatorTest {
    @Test
    public void BaseExponentiationalCalculatorTest(){
        int base = 2;
        int exponent = 3;
        int excepted = 8;
       // int base = -2, exponent = 3;
      //  int excepted = -8;// worked
        // int base = 2, exponent = -3;
        //  int excepted = -8;//  not worked

        BaseExponentiationalCalculator bec = new BaseExponentiationalCalculator();
        int result = bec.isExponentiationalCalculator(base, exponent);
        Assertions.assertEquals(excepted,result);
    }
    @Test
    public void BaseExponentiationalCalculatorTestForExponent(){
        int base = 2;
        int exponent = 0;
        int excepted = 1;
        BaseExponentiationalCalculator bec = new BaseExponentiationalCalculator();
        int result = bec.isExponentiationalCalculator(base, exponent);
        Assertions.assertEquals(excepted,result);
    }
}
