package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


Dosa d1= new OnionDosa();
d1.prepareDosa();
float change_1=d1.pay();
Dosa d2= MasalaDosa.getDosa();
float change_2=d2.pay();
    }
}