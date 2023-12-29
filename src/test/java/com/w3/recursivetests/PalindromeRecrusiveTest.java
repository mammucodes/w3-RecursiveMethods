package com.w3.recursivetests;

import com.w3.recursive.PalindromeRecursive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeRecrusiveTest {
    @Test
    public void isPlaindromeRecursiveTest() {
        String str = "level";
        boolean excepted = true;
        PalindromeRecursive pr = new PalindromeRecursive();
        boolean result = pr.isPalindrome(str);
        Assertions.assertEquals(excepted, result);
    }

    @Test
    public void isPlaindromeRecursiveTestWhenEmpty() {
        String str = "";
        boolean excepted = true;
        PalindromeRecursive pr = new PalindromeRecursive();
        boolean result = pr.isPalindrome(str);
        Assertions.assertEquals(excepted, result);
    }

    @Test
    public void isPlaindromeRecursiveTestWhenLength1() {
        String str = "z";
        boolean excepted = true;
        PalindromeRecursive pr = new PalindromeRecursive();
        boolean result = pr.isPalindrome(str);
        Assertions.assertEquals(excepted, result);
    }

    @Test
    public void isPlaindromeRecursiveTestFail() {
        String str = "love";
        boolean excepted = false;
        PalindromeRecursive pr = new PalindromeRecursive();
        boolean result = pr.isPalindrome(str);
        Assertions.assertEquals(excepted, result);

    }

    @Test
    public void isPlaindromeRecursiveTestFailNullcase() {
        String str = null;
        PalindromeRecursive pr = new PalindromeRecursive();
        Assertions.assertThrows(IllegalArgumentException.class, () -> pr.isPalindrome(str));
    }
}
