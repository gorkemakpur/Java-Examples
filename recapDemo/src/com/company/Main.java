package com.company;

public class Main {

    public static void main(String[] args) {
        double[] myList = {5.2, 1.8, 3, 4.8};
        double total = 0;
        double max = myList[0];
        for (double myListitem : myList) {
            if (myListitem > max) {
                max = myListitem;
            }
            System.out.println(myListitem);
            total += myListitem;
        }
        System.out.println("Sayıların Toplamı " + total + " eder");
        System.out.println("En büyük sayı:" + max + " olarak bulunur");
    }
}
