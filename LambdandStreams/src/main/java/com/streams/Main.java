package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
Lazy evaluation
Short circuiting
Operation fusion
*/

public class Main {

    public static void main(String[] args) {


        List<Integer> i= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        System.out.println(i.stream().filter(e->e%2==0).map(e->e*e));
        System.out.println(i.stream().filter(e->e%2==0).map(e->e*e).findFirst());

    }

}
