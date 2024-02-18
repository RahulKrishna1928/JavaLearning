package org.example;

public class Controlstatement {


    public static void main(String[] args) {
        Controlstatement c = new Controlstatement();
        c.notmain();
        System.out.print("Sum is :"+c.sum(3,5) + "\n");
        String[] fruits = new String[]{"apple", "mango", "orange"};
        for (String fruit : fruits) {
            switch (fruit) {
                case "apple":
                case "orange":
                    System.out.print(fruit + " is a citrus fruit" + "\n");
                    break;
                default:
                    System.out.print(fruit + " is not a citrus fruit" + "\n");
            }
        }


    }

    public void notmain() {
        String[] fruits = new String[]{"apple", "mango", "orange"};
        for (String fruit : fruits) {
            if(fruit.equals("apple") || fruit.equals("orange"))
                    System.out.print(fruit + " is a citrus fruit" + "\n");
            else
                    System.out.print(fruit + " is not a citrus fruit" + "\n");
            }
        }

       public int sum(int a,int b)
       {
           return a+b;
       }

    }
