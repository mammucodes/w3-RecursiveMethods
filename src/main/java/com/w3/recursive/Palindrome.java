package com.w3.recursive;

public class Palindrome {

    //This method
    public boolean isPalindrome(String str) {
        int n = str.length();
        int i = 0;
        int k = str.length() - 1;
        while (i <= n / 2) {
            if (str.charAt(i) == str.charAt(k)) {
                i++;
                k--;
            } else {
                return false;
            }
        }
        return true;
    }
}