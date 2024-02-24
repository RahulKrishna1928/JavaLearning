package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main1 {


    public static void main(String[] args) {

        List<Integer> j= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));


        // Java 8 executes map but not java 9
        j.stream().map(e->{System.out.println(e);return e*e;}).count();

/*  Characteristics of stream implemented using bitmap

        j.stream()  // SIZED, ORDERED
                .distinct()  // SIZED, ORDERED, DISTINCT
                       .sorted()  SIZED, SORTED, DISTINCT
                            .count();//

 */
    }
}
