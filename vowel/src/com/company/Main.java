package com.company;

public class Main {

    public static void main(String[] args) {
        char harf = 'U';
        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("KALIN");
                 break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("İNCE");
                break;
            default:
                System.out.println("Hatalı harf girdiniz harfinizin büyük olduğundan emin olunuz");
        }
    }
}
