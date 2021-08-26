package cisco.java.innerClass;

class MotherBoard
{
    static class USB
    {
        int usb2 = 2;
        int usb3 = 1;
        int getTotalPorts()
        {
            return usb2 + usb3;
        }
    }
}

public class Static_Nest_main
{
    public static void main(String[] args)
    {
        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total Ports = "+ usb.getTotalPorts());
    }
}
