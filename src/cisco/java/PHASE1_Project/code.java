package cisco.java.PHASE1_Project;

import java.io.File;
import java.util.Scanner;

public class code
{
    Scanner sc = new Scanner(System.in);
    File fileList = new File("C:\\Users\\ADMIN\\Documents\\PROJECT_p1");
    String[] content = fileList.list();

    private void display()
    {
        System.out.println("Choose Given option to perform task");
        System.out.println("Press 1 for list of files");
        System.out.println("Press 2 for Sub options given for do file related operations");
        System.out.println("Press 3 for close application");
    }

    private void display2()
    {
        System.out.println("Press 1 for add file to existing directory");
        System.out.println("Press 2 for delete file");
        System.out.println("Press 3 for searching file");
        System.out.println("Press 4 to go main context");
    }

    private void switchOption()
    {
        System.out.println("-----------------------------------------------------------------------------------------");
        display();
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                if(content.length != 0)
                    for(String x:content)
                    {
                        System.out.println(x);
                    }
                else
                {
                    System.out.println("No files in directory");
                }
                switchOption();
                break;
            case 2:
                switchSubOption();
                break;
            case 3:
                System.out.println("            --------------- CLOSING APPLICATION, Thank You ---------------");
                break;
            default:
                switchOption();
        }
    }

    private void switchSubOption()
    {
        System.out.println("--------******************************************************************--------");
        display2();
        int subChoice =sc.nextInt();
        switch (subChoice)
        {
            case 1:
                System.out.println("Enter file name : ");
                String nameOfFile = sc.nextLine();
                File file = new File(fileList,nameOfFile+".txt");
                try
                {
                    if(file.createNewFile())
                    {
                        System.out.println("File added to directory...");
                    }
                    else
                    {
                        throw new invalidException("File already in directory");
                    }
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
                switchSubOption();
                break;
            case 2:
                System.out.println("Enter file name to delete with extension : ");
                String nameOfFileToDelete = sc.next();
                File deleteFile = new File(fileList,nameOfFileToDelete);
                try
                {
                    boolean check = deleteFile.delete();
                    if(check)
                    {
                        System.out.println("File Deleted...");
                    }
                    else
                    {
                        throw new invalidException("File is not in directory");
                    }
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
                switchSubOption();
                break;
            case 3:
                System.out.println("Enter file name to search with extension : ");
                String nameOfFileToSearch = sc.next();

                try
                {
                    boolean foundedOrNot=false;
                    for(String x:content)
                    {
                        if(x.equals(nameOfFileToSearch))
                        {
                            foundedOrNot=true;
                            System.out.println("File founded");
                            break;
                        }
                    }
                    if(!foundedOrNot)
                    throw new invalidException("File not available in the directory, Not founded");
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
                switchSubOption();
                break;
            case 4:
                 switchOption();
                break;
            default:
                display2();
                switchSubOption();
        }
    }
    public static void main(String[] args)
    {
        System.out.println("                       --------W_E_L_C_O_M_E--------");
        code obj = new code();
        obj.switchOption();
    }
}
class invalidException extends Exception
{
    invalidException(String str)
    {
        super(str);
    }
}
