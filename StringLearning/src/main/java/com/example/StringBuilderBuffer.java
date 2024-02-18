package com.example;

public class StringBuilderBuffer {
    public static void main(String[] args) {

        // String builder is non synchronised so not thread safe
        StringBuilder s=new StringBuilder("HelloWorld");
        s.append(10);
        //This works because String Builder is mutable
        System.out.println(s);
        // String buffer is  synchronised so thread safe
        StringBuffer t=new StringBuffer("HelloWorld");
        t.append(10);
        System.out.println(t);
        //This works because String Builder is mutable
    }
}
