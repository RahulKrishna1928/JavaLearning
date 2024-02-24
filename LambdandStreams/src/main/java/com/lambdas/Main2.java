package com.lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main2
{


    public static void main(String[] args) {

        Predicate<Integer> p=a->a%2==0;
        p.test(5);


        Consumer<Integer> c=a->{};
        c.accept(5);
        Consumer<Integer> c1=a->System.out.println(a);
        c.accept(5);

        Supplier<Integer> s=()->22;
        s.get();

        Function<Integer,Integer> f=a->a*a;
        f.apply(2);
    }

}
