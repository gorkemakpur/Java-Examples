package com.company;

public class Main {

    public static void main(String[] args) {

        try
        {
            int [] sayilar=new int[]{1,2,3};
            System.out.println(sayilar[2]);

        }
        catch (Exception exception)
        {
            System.out.println("hata oluştu");
        }
        finally
        {
            System.out.println("Finally çalışıyor");
        }


    }
}
