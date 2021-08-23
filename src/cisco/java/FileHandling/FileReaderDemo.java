package cisco.java.FileHandling;

import java.io.FileReader;

public class FileReaderDemo
{
    public static void main(String[] args)
    {
        char[] array = new char[45];

        try
        {
            FileReader input = new FileReader("C:\\Users\\ADMIN\\Documents\\filewriter.txt");
            input.read(array);

            System.out.println("data in the file");
            System.out.println(array);
            input.close();
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
    }
}
