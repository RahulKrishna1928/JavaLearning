package com.methodreferences;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {



        List<String> s=new ArrayList<String>(Arrays.asList("Hello","","%^hh",null,"World"));

        /*
        remove empty strings
        remove strings with special characters
        sort names in alphabetical order
        upper case of names
        create employee objects
         */

        //s.stream().filter(e-> StringUtils.isNotEmpty(e)).forEach(System.out::println);

        //Method reference using static method, instance method and constructor

        s.stream().filter(StringUtils::isNotEmpty).map(String::toUpperCase).sorted(String::compareTo).map(Employee::new).forEach(System.out::println);


    }
}
