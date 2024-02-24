package com.lambdas;





//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

public void methodA()
{

 methodB(a -> a%2==0);
 methodB(a -> a%2!=0);
 methodC(a -> a.isEmpty());

}

public void methodB(FuncInterface<Integer> f)
{

  System.out.println(f.testIt(5)) ;

}

    public void methodC(FuncInterface<String> f)
    {

        System.out.println(f.testIt("Hello")) ;

    }

    public static void main(String[] args) {
        Main m=new Main();
        m.methodA();
    }

}