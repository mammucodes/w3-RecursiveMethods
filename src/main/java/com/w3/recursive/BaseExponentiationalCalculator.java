package com.w3.recursive;

public class BaseExponentiationalCalculator {
    //this methods takes base and exponent values as parameters
    // returns int value
    //throws exception for negative values
    //cjeck result for negtive exponent
    public  int isExponentiationalCalculator(int base, int exponent){

        if(exponent==0)
            return 1;
        return  base*isExponentiationalCalculator(base, exponent-1);

    }
}
