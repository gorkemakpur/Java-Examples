package com.company;

public class Main {

    public static void main(String[] args) {
        int sayi = 3;
        boolean isPrime=true;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                isPrime=false;
                break;
            }
            else {
                isPrime=true;
                break;
            }
        }
        if(isPrime==true){
            System.out.println(sayi+" sayısı ASALDIR");
        }
        else if(isPrime==false){
            System.out.println(sayi+" sayısı ASAL DEĞİL");
        }
    }
}
