package cisco.java.FileHandling;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;


public class FileOutputStreamProgram
{
    public static void main(String[] args)
    {
        try {

        DataInputStream dis = new DataInputStream(System.in);

        FileOutputStream fout = new FileOutputStream("C:\\Users\\ADMIN\\Documents\\xyz.txt",true);

        BufferedOutputStream bout = new BufferedOutputStream(fout,1024);
        System.out.println("Enter Text (@ at the end):");
        char ch;

        while((ch=(char)dis.read())!='@')
        {
            bout.write(ch);
        }
        bout.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
