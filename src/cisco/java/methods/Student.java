package cisco.java.methods;

public class Student
{
    String name;
    int age;
    char section,gender;
    int sub1,sub2,sub3;

    Student(int m1,int m2,int m3)
    {
        sub1=m1;
        sub2=m2;
        sub3=m3;
        System.out.println("Total Marks"+total());
        System.out.println("Percentage "+percentage());
    }
    Student(int m2,int m3)
    {
        sub1=0;
        sub2=m2;
        sub3=m3;
        System.out.println("Total Marks = "+total());
        System.out.println("Percentage = "+percentage());
    }

    int total()
    {
        return sub1+sub2+sub3;
    }
    float percentage()
    {
        return (total()/3);
    }

    public static void main(String[] args)
    {
        Student s1,s2,s3,s4;
        System.out.println("------Student s1 total marks and percentage----------");
              s1=new Student(20,30,40);
        System.out.println("------Student s2 total marks and percentage----------");
              s2=new Student(40,50);
        System.out.println("------Student s3 total marks and percentage----------");
              s3=new Student(50,60);
        System.out.println("------Student s4 total marks and percentage----------");
              s4=new Student(10,40,50);
    }
}
