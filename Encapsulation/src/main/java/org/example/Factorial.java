package org.example;

public class Factorial {


    public static int factorial(int x)

    {
         if(x>1) {
             int y = x * factorial(x - 1);
             return y;
         }
        else
            return 1;
    }

    public static void main(String[] args) {

        System.out.print(Factorial.factorial(3));
    }
}
