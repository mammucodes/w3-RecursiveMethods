package com.w3.gcd;

public class GcdOfTwoNumbers {
    //param: takes a and b as  int values
    //returns : int value of gcd number
    //throws: Exception if both  and b values are 0
    //if any onevalue is zero returns other numbers as mod
    //ex if a=0 b=-6 returns |b| value = 6;
    public int gcdOftwoNumberswithoutRecurisve(int a, int b) {


        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("define values grater than 0");
        }
        if (a == 0 || b == 0) {
            if (a == 0) {
                if (b > 0) {
                return b;
                } else if (b < 0) {
                   return b*-1;
                }
            } else if (b == 0) {
                if (a > 0) {
                 return a;
                } else if (a < 0) {
                 return a*-1;
                }

            }
        }
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        return gcd;
    }
}
