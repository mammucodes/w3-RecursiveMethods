package com.w3.recursive;

public class PalindromeRecursive {


    //this method takes a string as input and checks if it is a palindrome or not
    //if null is passed, IllegalArgumentException is thrown
    public boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null is not allowed!!");
        }
        return isPalindromeRecursive(str, 0, str.length() - 1);
    }


    private boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end)
            return true;
        if (str.charAt(start) != str.charAt(end))
            return false;
        else {

            return isPalindromeRecursive(str, start + 1, end - 1);
        }

    }
}