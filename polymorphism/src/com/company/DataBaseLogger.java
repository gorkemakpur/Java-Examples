package com.company;

public class DataBaseLogger extends BaseLogger
{
    public void Log(String message)
    {
        System.out.println("logged to database: "+message);
    }
}
