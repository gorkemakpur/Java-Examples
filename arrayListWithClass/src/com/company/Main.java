package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers=new ArrayList<Customer>();

        customers.add(new Customer(1,"First","aaaaa"));
        customers.add(new Customer(2,"Second","bbbbb"));
        customers.add(new Customer(3,"Third","cccc"));
        Customer fourth=new Customer(4,"fourth","ddddd");
        customers.add(fourth);

        customers.remove(fourth);

for(Customer customer:customers){
    System.out.println(customer.firstName);
}

    }
}
