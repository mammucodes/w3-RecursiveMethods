package com.w3.recursive;

public class ReverseStringRecursive {
    public String reverseStringUsingRecursive(String str){
        if(str==null)
            throw new IllegalArgumentException("Strin cannot be null ");
        if(str.isEmpty()||str.length()==1)
            return str;
        return reverseStringUsingRecursive(str.substring(1))+str.charAt(0);

    }
}
