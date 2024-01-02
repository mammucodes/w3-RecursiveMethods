package com.w3.recursivetests;

public class StringImmutable {
    String name ;
    public static void main(String[] args) {
       String s1 = new String("mamatha");
       String s2 = s1;
       s1 = s1.concat("Reddy");
        System.out.println(s2);
        System.out.println(s1);

        if(s1 == s2) {
            System.out.println("Both s1 and s2 are pointing to same object!");
        } else {
            System.out.println("Both s1 and s2 are NOT pointing to same object!");
        }



    }
    public StringImmutable(String  name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
