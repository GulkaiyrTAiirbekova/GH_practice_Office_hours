package org.example;
//public class Main {
//    public static void main(String[] args) {
//
//        System.out.printf("Hello and welcome!");
//    }
//}

public class Main{
    public static void main(String [] args){
        int items = 56;
        float costPerItem =8.99f;
        float totalCost  =items * costPerItem;
        char currency = '$';

        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem);
        System.out.println("Total cost = " + totalCost +currency);
    }
}