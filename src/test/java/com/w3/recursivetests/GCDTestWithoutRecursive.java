package com.w3.recursivetests;

import com.w3.gcd.GcdOfTwoNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GCDTestWithoutRecursive {
    @Test
    public void GCDOfTwoNumbersTest(){
        int a=4, b= 16;
        int excepted = 4;
        GcdOfTwoNumbers gcd = new GcdOfTwoNumbers();
        int result = gcd.gcdOftwoNumberswithoutRecurisve(a,b);
        Assertions.assertEquals(excepted,result);

    }
    @Test
    public void gcdOfNumbersWithValuesZero(){
        int a=0, b =0;
        GcdOfTwoNumbers gcd = new GcdOfTwoNumbers();
        Assertions.assertThrows( IllegalArgumentException.class, ()->gcd.gcdOftwoNumberswithoutRecurisve(a,b));
    }
    @Test
    public void gcdwithAnyOneNumberZero(){
        int a =0 , b= -5;
        int excepted = 5;
        GcdOfTwoNumbers gcd = new GcdOfTwoNumbers();
        int result = gcd.gcdOftwoNumberswithoutRecurisve(a,b);
        Assertions.assertEquals(excepted,result);
    }
}
