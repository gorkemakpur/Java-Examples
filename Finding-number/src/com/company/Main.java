package com.company;

public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranan = 6;
        for (int i = 0; i < sayilar.length; i++) {
	    if(sayilar[i]==aranan){
            System.out.println("dizide var");
        }
	    else{
            System.out.println("dizide yok");
        }
        }
    }
}
