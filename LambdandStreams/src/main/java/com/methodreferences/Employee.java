package com.methodreferences;

public class Employee {

   public String name;

   Employee(String name){
       this.name=name;
   }

    @Override
    public String toString() {
        return "Employee{"
                +"name='" +name+'\''+
                '}';
    }
}
