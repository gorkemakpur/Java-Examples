package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Shangai");
        cities.add("London");
        cities.add("Tokyo");



        MyList<String> countries =new MyList<String>();
        countries.add("Japan");
        countries.add("England");
        countries.add("China");


        MyList<Customer> customer =new MyList<Customer>();
        customer.add(new Customer());
        customer.add(new Customer());
        customer.add(new Customer);



    }
}
