package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws DefinedException{

          int i=10;
try {
    int result=i/0;
    throw new DefinedException("This is defined");

}
catch(ArithmeticException e)
{
    System.out.println(e.getMessage());
}
      finally
{}

        }




    }
