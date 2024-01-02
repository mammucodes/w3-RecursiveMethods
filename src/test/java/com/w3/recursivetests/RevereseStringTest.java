package com.w3.recursivetests;

import com.w3.recursive.ReverseString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RevereseStringTest {
    @Test
    public void reverseStringTest()
    {
       String str = "love";
       String excepted = "evol";
        ReverseString rs = new ReverseString();
        String result = rs.reverseString(str);
        Assertions.assertEquals(excepted,result);
    }
}
