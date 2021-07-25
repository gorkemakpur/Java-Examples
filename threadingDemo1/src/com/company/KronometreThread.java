package com.company;

import java.util.PrimitiveIterator;

public class KronometreThread implements Runnable
{

    private Thread thread;
    private String threadName;


    public KronometreThread(String threadName)
    {
        this.threadName=threadName;
        System.out.println("oluşturuluyor : "+threadName);
    }

    @Override
    public void run() {
        System.out.println("Thread çalıştırılıyor : "+ threadName);

        for (int i=0;i<=10;i++)
        {
            try {
                System.out.println(threadName+" : "+i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Arızalandı : "+threadName);
            }
        }
        System.out.println("İşlem Sonlandı : "+threadName);
    }
    public void Start()
    {
        System.out.println("Thread nesnesi oluşuyor");
        if(thread == null)
        {
            thread = new Thread(this,threadName);
            thread.start();
        }
    }

}
