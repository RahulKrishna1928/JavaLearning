package com.lambdas;





//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main1 {


    public static void main(String[] args) {

        FuncInterface<Integer> f=a->a%2==0;
        f.testIt(5);

        FuncInterface<String> g=a->a.isEmpty();
        g.testIt("Hello");

    }
}