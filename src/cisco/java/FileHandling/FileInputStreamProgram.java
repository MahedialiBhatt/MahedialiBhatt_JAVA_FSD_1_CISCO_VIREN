package cisco.java.FileHandling;

import java.io.FileInputStream;

public class FileInputStreamProgram
{
    public static void main(String[] args)
    {
        try {
    FileInputStream fin = new FileInputStream("C:\\Users\\ADMIN\\Documents\\xyz.txt");

    System.out.println(fin.getChannel());

    System.out.println("Number of bytes read "+fin.available());
    fin.skip(7);
    System.out.println("File Contents : ");

    int ch;

    while((ch=fin.read()) != -1)
        System.out.println((char)ch);
    fin.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
