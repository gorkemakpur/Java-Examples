package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String> sozluk=new HashMap<String,String>();

        sozluk.put("hello","merhaba");
        sozluk.put("book","kitap");
        sozluk.put("desk","sıra");
        System.out.println(sozluk.get("desk"));

    }
}
