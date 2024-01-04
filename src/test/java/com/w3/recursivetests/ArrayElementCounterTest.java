package com.w3.recursivetests;

import com.w3.arrayelementcounter.ArrayElementCounterOfSpecificElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayElementCounterTest {
    @Test
    public void ArrayElementCounterwithoutRecursiveTest(){
        int arr[] = {2,3,2,4,5,4,6,6,6};
        int target = 6;
        int excepted = 3;
        ArrayElementCounterOfSpecificElement ar = new ArrayElementCounterOfSpecificElement();
        int result = ar.ArrayElementCounter(arr,target);
        Assertions.assertEquals(excepted,result);
    }
    @Test
    public void ArrayElementCounterRecursiveTest(){
        int arr[] = {2,3,2,4,5,4,6,6,6};
        int target = 6;
        int excepted = 3;
        ArrayElementCounterOfSpecificElement ar = new ArrayElementCounterOfSpecificElement();
        int result = ar.ArrayElementCounterRecursive(arr,target);
        Assertions.assertEquals(excepted,result);

    }
}
