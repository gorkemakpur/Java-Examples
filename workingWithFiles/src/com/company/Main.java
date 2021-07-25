package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        readFile();
           writeFile();
readFile();
    }
    public static void createFile()
    {
        File file = new File("D:\\Java-Example\\workingWithFiles\\src\\com\\company\\files\\students.txt");
        try {
            if(file.createNewFile())
            {
                System.out.println("dosya oluşturuldu");
            }
            else
            {
                System.out.println("dosya mevcut");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo()
    {
        File file = new File("D:\\Java-Example\\workingWithFiles\\src\\com\\company\\files\\students.txt");
        if(file.exists())
        {
            System.out.println("Dosya adı: "+file.getName());
            System.out.println("Dosya yolu: "+file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi?: "+file.canWrite());
            System.out.println("Dosya okunabilir mi?: "+file.canRead());
            System.out.println("Dosya büyüklüğü: "+file.length());
        }
        else {}
    }

    public static void readFile()
    {
        File file = new File("D:\\Java-Example\\workingWithFiles\\src\\com\\company\\files\\students.txt");
        try {

            Scanner reader=new Scanner(file);
            while (reader.hasNextLine())
            {
                String line=reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void writeFile()
    {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Java-Example\\workingWithFiles\\src\\com\\company\\files\\students.txt",true));
            writer.newLine();
            writer.write("Akpur");
            System.out.println("Dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
