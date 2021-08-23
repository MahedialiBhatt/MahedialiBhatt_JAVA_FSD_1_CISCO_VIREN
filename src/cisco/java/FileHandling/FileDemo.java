package cisco.java.FileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo
{
    public static void main(String[] args)
    {
        try
        {
            File file = new File("C:\\Users\\ADMIN\\Documents\\xyz.txt");

            if(file.createNewFile())
                System.out.println("New file is created!");
            else
            {
                if(file.exists())
                {
                    System.out.println("File already exists.");
                    System.out.println("File path"+ file.getAbsolutePath());
                    System.out.println("File name:  "+ file.getName());
                    System.out.println("File Class"+ file.getClass());
                    System.out.println("File parent"+ file.getParent());
                    System.out.println("File space allocated" + file.getUsableSpace());
                    System.out.println("File length"+ file.length());
                    System.out.println("File list: "+ file.list());
                }
                else
                {
                    System.out.println("File doesnot exists.");
                }

                boolean b = file.delete();
                if(b==true)
                {
                    System.out.println("File deleted!!!");
                }
                else
                {
                    System.out.println("File not deleted");
                }
            }

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
