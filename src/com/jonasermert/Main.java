package com.jonasermert;

public class Main
{
    public static void main(String[] args)
    {
        String data = "0x2021";
        System.out.println(convert(data));
    }

    public static double convert(String rawstring)
    {
        int rawdata = Integer.decode(rawstring);
        int firstbyte = (rawdata & 0xff);
        int comma = (rawdata >> 15);

        if((firstbyte >> 7) == 0)
        {
            return firstbyte + (comma * 0.5);
        }
        else
        {
            return -((firstbyte ^ 0xff) + (comma * 0.5f));
        }
    }
}
