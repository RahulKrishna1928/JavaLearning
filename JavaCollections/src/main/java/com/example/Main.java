package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Maintains insertion order
        //allows duplicates
        // non-synchronized
        List<String> employeeNames= new ArrayList<>();
        employeeNames.add("Rahul");
        employeeNames.add("Krishna");
        Collections.sort(employeeNames);
        employeeNames.forEach(employeeName -> System.out.println(employeeName + " "));

        // same features as ArrayList, this is more efficient as switching doesn't happen
        //LinkedList class can act as a list and queue both because it implements List and Deque interfaces
        // You have to use iterator to read the elements
        List<String> carNames= new LinkedList<>();
        carNames.add("Hyundai");
        carNames.add("Honda");

        carNames.forEach(employeeName -> System.out.println(employeeName + " "));




    }
}