package com.company;

public class Main {

    public static void main(String[] args) {
        int sayi1=1184;
        int total1=0;
        int sayi2=1210;
        int total2=0;
        for(int i=1;i<sayi1;i++){
            if(sayi1 % i==0){
                total1+=i;
            }
        }

        for(int j=1;j<sayi2;j++){
            if(sayi2 % j==0){
                total2+=j;
            }
        }

        if(total1==sayi2 && total2==sayi1){
            System.out.println(sayi1+" ve "+sayi2+" Arkadaş sayılardır");
        }

    }
}
