package cisco.java.FileHandling;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String data;
        try
        {
            FileWriter output = new FileWriter("C:\\Users\\ADMIN\\Documents\\filewriter.txt");
            data = sc.nextLine();
            System.out.println(data);
            output.write(data);
            System.out.println("data is written");
            output.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
