package com.company;
import java.awt.*;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;
class readfile
{
    public static void read() throws IOException
    {
        try
        {
            File myname = new File("C:\\Users\\ELCOT\\Saibaba.txt");
            Scanner myreader = new Scanner(myname);
            while(myreader.hasNextLine())
            {
                String line = myreader.nextLine();
                System.out.println(line);
            }
            myreader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        readfile read = new readfile();
        read.read();
    }
}
