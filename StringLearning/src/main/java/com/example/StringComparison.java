package com.example;

public class StringComparison {

   public static void main(String[] args)

   {
       String s1="Rahul";
       String s2="Rahul";
       System.out.print(s1==s2);
       System.out.print("\n");
       System.out.print(s1.equals(s2));
       System.out.print("\n");
       System.out.print(s1+"\n");
       System.out.print(s2+"\n");
       s1="Krishna";
       System.out.print(s1+"\n");
       System.out.print(s2+"\n");

       String s3= new String("Rahul");
       String s4= new String("Rahul");
       System.out.print(s3==s4);
       System.out.print("\n");
       System.out.print(s3.equals(s4));


   }



}
