package com.company;

public class Main {

    public static void main(String[] args) {

        String[] students=new String[4];
        students[0]="Cahit";
        students[1]="Ahit";
        students[2]="Ahu";
        students[3]="Dudu";

        for(int i=0;i<students.length;i++) {
            System.out.println(students[i]);
        }
        System.out.println("-------------");
        for(String student:students)
        {
            System.out.println(student);
        }
    }
}
