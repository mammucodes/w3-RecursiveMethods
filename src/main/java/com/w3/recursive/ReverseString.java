package com.w3.recursive;

public class ReverseString {
    public String reverseString(String str){
        int n = str.length();
       int i =0;
      //  while(i<=n/2){
           // char temp = str.charAt(i);
            //  str.charAt(i) = str.charAt(n-1);// does not work because String are immuatable
         // String  str.charAt(n-1) = temp;
            i++;
           // n--;
       // }
        char[]  ch = str.toCharArray();
        int s=0;
        int e = n-1;
        while(s<e){
            char temp = ch[s];
            ch[s]= ch[e];
            ch[e] = temp;
            s++;
            e--;
        }
return new String(ch); /*
 accepts an array of characters (char[]) as an argument.
 When you use new String(charArray), it creates a new String object by
 constructing it from the given array of characters.*/
    }
}
