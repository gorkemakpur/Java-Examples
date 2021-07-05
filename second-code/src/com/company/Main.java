package com.company;

public class Main {

    public static void main(String[] args) {
        char grade = 'S';
        switch (grade) {
            case 'A':
                System.out.println("Geçtiniz ");
                break;
            case 'B':
                System.out.println("Geçtiniz ");
                break;
            case 'C':
                System.out.println("Şartlı Geçtiniz ");
                break;
            case 'D':
                System.out.println("Kaldınız ");
                break;
            default:
                System.out.println("GEÇERSİZ Not girdiniz");
                break;
        }
    }
}
